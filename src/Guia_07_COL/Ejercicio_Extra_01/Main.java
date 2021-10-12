package Guia_07_COL.Ejercicio_Extra_01;

public class Main {

    public static void main(String[] args) {
        Service serv = new Service();
        Numbers n = new Numbers();
        
        serv.createNumbers(n);
        serv.showData(n);
    }

}
