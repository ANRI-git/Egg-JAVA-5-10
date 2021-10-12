package Guia_06_POO.Ejercicio_Extra_02;

public class Ejercicio_Extra_02 {

    public static void main(String[] args) {
        Service serv = new Service();
        Puntos p = new Puntos();
        serv.crearPuntos(p);
        serv.calculateDistance(p);
    }

}
