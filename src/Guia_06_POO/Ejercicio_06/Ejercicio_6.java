package Guia_06_POO.Ejercicio_06;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Cafetera caf1 = new Cafetera();
        Service serv = new Service();
        
        serv.elegirCafetera(caf1);
        serv.agregarCafe(caf1);
        serv.servirTaza(caf1);
        serv.llenarCafetera(caf1);
        serv.vaciarCafetera(caf1);
    }

}

