package Guia_6_POO.Ejercicio_Extra_04;


public class NIF {
    private long DNI;
    private char c;

    public NIF() {
    }

    public NIF(long DNI, char c) {
        this.DNI = DNI;
        this.c = c;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
    
}
