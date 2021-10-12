package Guia_06_POO.Ejercicio_Extra_04;

import java.util.Scanner;


public class Service {
    Scanner sc = new Scanner(System.in);
    
    public char calculateChar(NIF n){
        char chars [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int num =(int) n.getDNI()%23;
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (num == i){
                System.out.println(chars[i]);
                return chars[i];
            }
        }
        return 0;
    }
    
    public void createNIF(NIF n){
        System.out.println("Enter you DNI:");
        n.setDNI(sc.nextLong());
        System.out.println("Calculating NIF");
        n.setC(calculateChar(n));
    }
    
    public void showNIF(NIF n){
        System.out.println("Your NIF number is: ");
        System.out.println(n.getDNI() + "-" + n.getC());
    }
    
}
