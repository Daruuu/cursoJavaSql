package exerJava33;

public class TarjetaCredito {

    private final int SALDO = 1000;
    private int numeroTarjeta;
    private String entidadEmisora;
    private String fechaCaducidad;
    private String titular;



    //CONSTRUCTORS

    public TarjetaCredito(String entidadEmisora, String fechaCaducidad, String titular, int numeroTarjeta) {
        this.entidadEmisora = entidadEmisora;
        this.fechaCaducidad = fechaCaducidad;
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
    }

    public TarjetaCredito() {
    }

    //METHODS
    public void activar(){


    }

    public void Pagar(){


    }

    public void anular(){


    }


    //GETTERS & SETTERS

    public String getEntidadEmisora() {
        return entidadEmisora;
    }

    public void setEntidadEmisora(String entidadEmisora) {
        this.entidadEmisora = entidadEmisora;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}

