package TALLER_NODOS;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();

        boolean sistema = true;
        while (sistema) {
            try {
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UNA OPCION: \n"
                        + "1. AGREGAR CONGRESISTA \n"
                        + "2. ELIMINAR CONGRESISTA \n"
                        + "3. LISTA CONGRESISTAS \n"
                        + "4. SALIR"));
                switch (op) {
                    case 1:
                        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA IDENTIFICACION: "));
                        String nombre = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL CONGRESISTA: ");
                        String partidoPolitico = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL PARTIDO POLITICO:  ");
                        int votos = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE VOTOS: "));

                        if (lista.existCongresista(identificacion)) {
                            JOptionPane.showMessageDialog(null, "CONGRESISTA EXISTENTE");
                            break;
                        }

                        Congresista congre = new Congresista(identificacion, nombre, partidoPolitico, votos);

                        int opAdd = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UNA OPCION: \n"
                                + "1. AGREGAR CONGRESISTA AL INICIO \n"
                                + "2. AGREGAR CONGRESISTA AL FINAL \n"
                                + "3. AGREGAR CONGRESISTA ENTRE DOS CONGRESISTAS \n"
                                + "4. ATRAS"));
                        switch (opAdd) {
                            case 1:
                                lista.addStart(congre);
                                break;
                            case 2:
                                lista.addFinal(congre);
                                break;
                            case 3:
                                lista.between(congre);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");
                                break;
                        }
                        break;
                    case 2:
                        identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA IDENTIFICACION DEL CONGRESISTA A ELIMINAR: "));
                        if (lista.existCongresista(identificacion)) {
                            lista.delete(identificacion);
                        } else {
                            JOptionPane.showMessageDialog(null, "CONGRESISTA NO EXISTENTE");
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "*** LISTADO CONGRESISTA ***\n " + lista.showAll());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "SISTEMA FINALIZADO");
                        sistema = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");
                        break;
                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "HA OCURRIDO EL SIGUIENTE ERROR -> " + error.getMessage().toUpperCase());
            } catch (IllegalArgumentException error) {
                JOptionPane.showMessageDialog(null, "HA OCURRIDO EL SIGUIENTE ERROR -> " + error.getMessage().toUpperCase());
            }
        }
    }
}
