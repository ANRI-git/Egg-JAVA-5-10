package Guia_6_POO.Ejercicio_05;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bienvenido al sistema bancario:");
        System.out.println("Primero deberá crear una cuenta");
        Cuenta cuenta1 = new Cuenta();
        Service serv = new Service();
        serv.crearCuenta(cuenta1);
        int op;
        do {
            System.out.println("¿Que desea hacer?:");
            System.out.println("1. Ingresar dinero.\n2. Retiro normal de dinero."
                    + "\n3. Retiro rápido de dinero.\n4. Consultar saldo.\n5. Co"
                    + "nsultar datos de la cuenta.\n0. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    serv.ingresar(cuenta1);
                    break;
                case 2:
                    serv.retirar(cuenta1);
                    break;
                case 3:
                    serv.extraccionRapida(cuenta1);
                    break;
                case 4:
                    serv.consultarSaldo(cuenta1);
                    break;
                case 5:
                    serv.consultarDatos(cuenta1);
                    break;
                case 0:
                    System.out.println("Muchas gracias por utilizar nuestros ser"
                            + "vicios!");
                    break;
                default:
                    System.out.println("Opción incorrecta, vielva a ingresar:");
                    break;
            }
        } while (op != 0);

    }

}
