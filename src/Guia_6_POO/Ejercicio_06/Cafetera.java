package Guia_6_POO.Ejercicio_06;

public class Cafetera {
    private int capMaxima;
    private int capActual;

    public Cafetera() {
    }

    public Cafetera(int capMaxima, int capActual) {
        this.capMaxima = capMaxima;
        this.capActual = capActual;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }
    
}
