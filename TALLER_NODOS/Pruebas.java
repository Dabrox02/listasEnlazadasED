package TALLER_NODOS;

public class Pruebas {

    public static void main(String[] args) {

        Lista lista = new Lista();

        Congresista congre1 = new Congresista(1, "JAIDER", "PADAS", 545654);
        Congresista congre2 = new Congresista(2, "ANDRES", "PADAS", 235);
        Congresista congre3 = new Congresista(3, "CARLOS", "PADAS", 5454);
        Congresista congre4 = null;
        Congresista congre5 = new Congresista(5, "LARA", "PADAS", 98794);
        Congresista congre6 = new Congresista(6, "JAIDER", "PADAS", 98794);

        try {

            // VALIDANDO INICIO
//        lista.addStart(congre1);
//        System.out.println("==============");
//        System.out.println(lista.showAll());
//        lista.addStart(congre2);
//        System.out.println("==============");        
//        System.out.println(lista.showAll());
//        //lista.addStart(congre4);
//        System.out.println("==============");        
//        System.out.println(lista.showAll());
            // VALIDANDO FINAL
            lista.addFinal(congre1);
            System.out.println("==============");
//            System.out.println(lista.showAll());

            lista.addFinal(congre5);
            System.out.println("==============");
//            System.out.println(lista.showAll());

            lista.addFinal(congre2);
            lista.addFinal(congre3);
            System.out.println("==============");
            System.out.println(lista.showAll());

            // VALIDANDO BETWEEN
//            lista.between(congre6);
//            System.out.println("==============");
//            System.out.println(lista.showAll());
//
//            lista.between(congre5);
//            System.out.println("==============");
//            System.out.println(lista.showAll());
//
//            lista.between(congre3);
//            System.out.println("==============");
//            System.out.println(lista.showAll());
            lista.delete(3);
            System.out.println("==============");
            
            System.out.println(lista.showAll());

        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }

    }
}
