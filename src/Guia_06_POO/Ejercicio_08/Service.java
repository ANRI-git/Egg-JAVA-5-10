package Guia_6_POO.Ejercicio_08;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public void mostrarVocales(Cadena cad) {
        int cont = 0;
//        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cad.getLongitud(); i++) {
//            char n = cad.getFrase().charAt(i);
//            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U') {
            //IndexOf busca la letra en el string 'vocales' y devuelve 0 cuando la encuentra.
            if ("aeiouAEIOU".indexOf(cad.getFrase().charAt(i)) == 0){
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales.");
    }

    public void invertirFrase(Cadena cad) {
        System.out.println("Invirtiendo frase:");
        StringBuilder stringBuilder = new StringBuilder(cad.getFrase());
        System.out.println(stringBuilder.reverse().toString());
    }

    public void vecesReperido(Cadena cad, String letra) {
        int cont = 0;
        char l = letra.charAt(0);
        for (int i = 0; i < cad.getLongitud(); i++) {
            char n = cad.getFrase().charAt(i);
            if (n == l) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No se encontró la letra.");
        } else if (cont == 1) {
            System.out.println("La letra " + l + " se repite " + cont + " vez.");
        } else {
            System.out.println("La letra " + l + " se repite " + cont + " veces.");
        }
    }

    public void compararLongitud(Cadena cad, String frase) {
        System.out.println("Primera frase: " + cad.getFrase() + "\nSegunda frase: " + frase);
        if (cad.getLongitud() > frase.length()) {
            System.out.println("La primer frase es más larga, por " + (cad.getLongitud() - frase.length()));
        } else if (cad.getLongitud() < frase.length()) {
            System.out.println("La segunda frase es más larga, por " + (frase.length() - cad.getLongitud()));
        } else {
            System.out.println("Las frases son igual de largas.");
        }
    }

    public void unirFrases(Cadena cad, String frase) {
        System.out.println("Frases unidas: \n" + cad.getFrase().concat(frase));
    }

    public void reemplazar(Cadena cad, String letra) {
        char l = letra.charAt(0);
        System.out.println("Frase modificada:");
        System.out.println(cad.getFrase().replace('a', l));
    }

    public Boolean contiene(Cadena cad, String letra) {
        boolean op = false;
        char l = letra.charAt(0);
        for (int i = 0; i < cad.getLongitud(); i++) {
            char n = cad.getFrase().charAt(i);
            if (n == l){
                op = true;
                break;
            }
        }
        return op;
    }
}
