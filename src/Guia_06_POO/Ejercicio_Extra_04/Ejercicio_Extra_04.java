package Guia_06_POO.Ejercicio_Extra_04;

public class Ejercicio_Extra_04 {

    public static void main(String[] args) {
        NIF n = new NIF();
        Service serv = new Service();
        
        serv.createNIF(n);
        serv.showNIF(n);
    }

}
