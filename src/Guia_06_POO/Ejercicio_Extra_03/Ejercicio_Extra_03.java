package Guia_06_POO.Ejercicio_Extra_03;

public class Ejercicio_Extra_03 {

    public static void main(String[] args) {
        Roots r = new Roots();
        Service serv = new Service();
        serv.createRoots(r);
        serv.calculate(r);
    }

}
