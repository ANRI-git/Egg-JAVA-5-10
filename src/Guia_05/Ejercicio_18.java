package Guia_05;

public class Ejercicio_18 {
    public static void main(String[] args) {
        System.out.println("¡Contador mágico!");
        int numA, numB, numC;
        String num1, num2, num3;
        numA=numB=0;
        numC=-1;
        while (numA!=9||numB!=9||numC!=9){
            numC++;
            if (numC==10){
                numB++;
                numC=0;
            }
            if (numB==10){
                numA++;
                numB=0;
            }
            if (numA==3){
                num1="E";
            }
            else{
                num1=String.valueOf(numA);
            }
            if (numB==3){
                num2="E";
            }
            else{
                num2=String.valueOf(numB);
            }
            if (numC==3){
                num3="E";
            }
            else{
                num3=String.valueOf(numC);
            }
            System.out.println(num1+"-"+num2+"-"+num3);
        }
    }
}
