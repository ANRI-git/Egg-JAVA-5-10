package Guia_5;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int contA = 0, contB = 0;
        do{
            System.out.println("Ingrese una palabra, que corresponda a 5 caracteres de maximo e inicie con X y finalice con O");
            frase = sc.nextLine();
            if (frase.equals("&&&&&")){
                continue;
            }
            if (frase.length()>5 || !frase.substring(0, 1).equals("x") || !frase.substring(frase.length()-1, frase.length()).equals("o")){
                contB = contB+1;
            }
            else{
                contA = contA+1;
            }
        }while (!frase.equals("&&&&&"));
        System.out.println("Finalizado\nLas frases correctas fueron: "+ contA +"\nLas frases incorrectas fueron: " + contB);
    }
}
