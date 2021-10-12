package Guia_10_EXC.Ejercicio_01;

public class Main {

    public static void main(String[] args) {
        Service serv = new Service();
        try {
            Persona p = new Persona();
            serv.esMayorDeEdad(p);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
    }

}
