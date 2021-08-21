package Guia_6_POO.Ejercicio_03;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println(op1.suma());
        System.out.println(op1.resta());
        System.out.println(op1.multi());
        System.out.println(op1.div());
    }

}
