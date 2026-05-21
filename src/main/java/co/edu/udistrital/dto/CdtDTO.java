package co.edu.udistrital.dto;

import java.io.Serializable;

public class CdtDTO extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    private int dias;
    private double valorInversion;
    private double tasaInteres;

    private double gananciaBruta;
    private double valorTotal;

    public CdtDTO() {
        super();
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValorInversion() {
        return valorInversion;
    }

    public void setValorInversion(double valorInversion) {
        this.valorInversion = valorInversion;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getGananciaBruta() {
        return gananciaBruta;
    }

    public void setGananciaBruta(double gananciaBruta) {
        this.gananciaBruta = gananciaBruta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
