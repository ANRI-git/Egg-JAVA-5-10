package Guia_06_POO.Ejercicio_09;

public class Ejercicio_9 {

    public static void main(String[] args) {
        Matematica mat = new Matematica();
        Service serv = new Service();
        
        serv.devolverMayor(mat);
        serv.calcularPotencia(mat);
        serv.calcularRaiz(mat);
    }

}
