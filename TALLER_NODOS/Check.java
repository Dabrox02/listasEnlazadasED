
package TALLER_NODOS;

public class Check {
    
    public static boolean checkBlank(String cad){
        if(cad.isBlank()) throw new IllegalArgumentException("El campo ingresado es vacio.");
        return false;
    }
    
    public static boolean checkNull(Object ob){
        if (ob == null) throw new IllegalArgumentException("El objeto enviado es vacio.");
        return false;
    }
    
}
