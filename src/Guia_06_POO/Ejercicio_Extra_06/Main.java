package Guia_06_POO.Ejercicio_Extra_06;

public class Main {

    public static void main(String[] args) {
        Ahorcado a = new Ahorcado();
        Service serv = new Service();

        serv.createGame(a);
        serv.showArray(a);
    }

}
