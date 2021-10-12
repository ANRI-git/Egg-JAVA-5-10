package Guia_06_POO.Ejercicio_09;

public class Service {

    public void devolverMayor(Matematica mat) {
        System.out.println("Calculando el mayor: ");
//        System.out.println("El mayor es: " + Math.max(mat.getN1(), mat.getN2()));
        if (mat.getN1() > mat.getN2()) {
            System.out.print("El mayor es el primer atributo: ");
            System.out.printf("%1.2f%n", mat.getN1());
        } else {
            System.out.print("El mayor es el segundo atributo: ");
            System.out.printf("%1.2f%n", mat.getN2());
        }
    }

    public void calcularPotencia(Matematica mat) {
        System.out.println("Calculando la potencia del mayor número por el menor:");
        System.out.printf("%1.2f%n", Math.pow(Math.max(mat.getN1(), mat.getN2()), Math.min(mat.getN1(), mat.getN2())));
//        if (mat.getN1()>mat.getN2()){
//            System.out.println("Potecia de n1 elevado a n2: " + Math.pow(mat.getN1(), mat.getN2()));
//        } else {
//            System.out.println("Potecia de n2 elevado a n1: " + Math.pow(mat.getN2(), mat.getN1()));
//        }
    }

    public void calcularRaiz(Matematica mat) {
        System.out.println("Calculando la raiz cuadrada del menor número:");
        System.out.printf("%1.2f%n", Math.sqrt(Math.abs(Math.min(mat.getN1(), mat.getN2()))));
//        if (mat.getN1()>mat.getN2()){
//            System.out.println("Raiz de n1 es: " + Math.sqrt(Math.abs(mat.getN1())));
//        } else {
//            System.out.println("Raiz de n2 es: " + Math.sqrt(Math.abs(mat.getN2())));
//        }
    }
}
