package TALLER_NODOS;

public class Congresista {
    
    /*
    ATRIBUTOS
    */
    private int identificacion;
    private String nombre;
    private String partidoPolitico;
    private int votosNum;
    
    public Congresista(int identificacion, String nombre, String partidoPolitico, int votosNum) {
        Check.checkBlank(nombre);
        Check.checkBlank(partidoPolitico);
        this.identificacion = identificacion;
        this.nombre = nombre.toUpperCase();
        this.partidoPolitico = partidoPolitico.toUpperCase();
        this.votosNum = votosNum;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Check.checkBlank(nombre);
        this.nombre = nombre.toUpperCase();
    }

    public String getPartidoPolitico() {
        return partidoPolitico.toUpperCase();
    }

    public void setPartidoPolitico(String partidoPolitico) {
        Check.checkBlank(partidoPolitico);
        this.partidoPolitico = partidoPolitico;
    }

    public int getVotosNum() {
        return votosNum;
    }

    public void setVotosNum(int votosNum) {
        this.votosNum = votosNum;
    }

    public String informacion() {
        return "Congresista[ "
                + "IDENTIFICACION: " + identificacion + " | "
                + "NOMBRE: " + nombre + " | "
                + "PARTIDO POLITICO: " + partidoPolitico + " | "
                + "NUMERO DE VOTOS: " + votosNum + " ]";
    }

}
