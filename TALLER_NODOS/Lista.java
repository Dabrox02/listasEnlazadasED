package TALLER_NODOS;

public class Lista {

    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    /* METODOS PARA LISTAS ENLAZADAS */
    // Metodo para Insertar al inicio de la lista
    public void addStart(Congresista congresista) {
        Check.checkNull(congresista);  // VALIDACION DE OBJETO VACIO
        inicio = new Nodo(congresista, inicio); // SE INSTANCIA UN NODO PASANDOLE COMO PUNTERO EL NODO INICIO.
        if (fin == null) {
            fin = inicio; // SI FIN ESTA VACIO, FIN TAMBIEN APUNTA A INICIO.
        }
    }

    // Metodo para insertar de penultimo en la lista
    public void between(Congresista congresista) {
        Check.checkNull(congresista);
        if (isEmpty()) {
            addStart(congresista);
            return;
        }

        if (inicio == fin) {
            addFinal(congresista);
            return;
        }

        Nodo n = inicio;
        Nodo nuevo = new Nodo(congresista);
        while (n != null) {
            if (n.enlace == fin) {
                n.enlace = nuevo;
                nuevo.enlace = fin;
                return;
            }
            n = n.enlace;
        }
    }

    // Metodo para insertar al final de la lista
    public void addFinal(Congresista congresista) {
        Check.checkNull(congresista);
        if (!isEmpty()) {
            fin.enlace = new Nodo(congresista);
            fin = fin.enlace;
        } else {
            inicio = fin = new Nodo(congresista);
        }
    }

    public void delete(int id) {

        if (!isEmpty()) {
            if (inicio == fin && inicio.congresista.getIdentificacion() == id) {
                inicio = fin = null;
            } else if (inicio.congresista.getIdentificacion() == id) {
                inicio = inicio.enlace;
            } else {
                Nodo prev = inicio;
                Nodo next = inicio.enlace;
                while (next != null && next.congresista.getIdentificacion() != id) {
                    prev = prev.enlace;
                    next = next.enlace;
                }
                if (next != null) {
                    prev.enlace = next.enlace;
                    if (next == fin) {
                        fin = prev;
                    }
                }
            }
        }
    }

    // Metodo para mostrar todos los elementos
    public String showAll() {
        Nodo n = inicio;
        String listado = "";
        while (n != null) {
            listado = listado + n.congresista.informacion() + "\n";
            n = n.enlace;
        }
        return listado;
    }

    // Validar si la lista no esta vacia
    public boolean isEmpty() {
        return (inicio == null || fin == null);
    }

    /* METODOS PARA CLASES ESPECIFICAS */
    public boolean existCongresista(int id) {
        Nodo n = inicio;
        while (n != null) {
            if (n.congresista.getIdentificacion() == id) {
                return true;
            }
            n = n.enlace;
        }
        return false;
    }
}
