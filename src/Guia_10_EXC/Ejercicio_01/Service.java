package Guia_10_EXC.Ejercicio_01;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese los datos:");
        System.out.println("Nombre:");
        persona.setNombre(sc.nextLine());
        System.out.println("Edad:");
        persona.setEdad(sc.nextInt());
        sc.nextLine();
        do {
            System.out.println("Sexo (M, H o O):");
            persona.setSexo(sc.nextLine());
            if (!persona.getSexo().equals("M") && !persona.getSexo().equals("H")
                    && !persona.getSexo().equals("O")) {
                System.out.println("Opción ingresada incorrecta, intente nuevamente:");
            }
        } while (!persona.getSexo().equals("M") && !persona.getSexo().equals("H") && !persona.getSexo().equals("O"));
        persona.setSexo(sc.next());
        System.out.println("Peso en kg:");
        persona.setPeso(sc.nextDouble());
        sc.nextLine();
        System.out.println("Altura en metros:");
        persona.setAltura(sc.nextDouble());
        sc.nextLine();
        if (persona.getAltura() >= 100) {
            persona.setAltura(persona.getAltura() / 100);
        }
        return persona;
    }

    public final double calcularIMC(Persona persona) {
//        System.out.println("Calculando IMC:");
        Double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public Boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
}
