package TALLER_NODOS;

public class Nodo {

    Congresista congresista;
    Nodo enlace;

    public Nodo() {
    }

    public Nodo(Congresista congresista) {
        this.congresista = congresista;
        enlace = null;
    }

    public Nodo(Congresista congresista, Nodo n) {
        this.congresista = congresista;
        enlace = n;
    }

}
