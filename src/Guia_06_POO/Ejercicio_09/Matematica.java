package Guia_06_POO.Ejercicio_09;

public class Matematica {
    private Double n1;
    private Double n2;

    public Matematica() {
        n1 = Math.random()*10;
        n2 = Math.random()*10;
    }
    
    public Matematica(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }
    
}
