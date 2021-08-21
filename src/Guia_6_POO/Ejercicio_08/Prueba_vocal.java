package Guia_6_POO.Ejercicio_08;

import java.util.Scanner;

public class Prueba_vocal {

    public static void main(String args[]) {
        System.out.print("Enter a sentence :");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        int consCount = 0;
        int i;

        for (i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (vowels.indexOf(currentChar) >= 0) {
                System.out.println(vowels.indexOf(currentChar));
                vowelCount++;
            } else if (Character.isLetter(currentChar)) {
                System.out.println(vowels.indexOf(currentChar));
                consCount++;
            }
        }
        System.out.print("nNumber of vowels is " + vowelCount);
        System.out.print("nNumber of consonant is " + consCount);
    }
}
