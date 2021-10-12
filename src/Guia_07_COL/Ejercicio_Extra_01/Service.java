package Guia_7_COL_Ejercicio_Extra_01;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void createNumbers(Numbers n) {
        System.out.println("Creating object Numbers!");
        Integer op;
        do {
            System.out.println("Introduce the next number of the list or write '-99' to stop:");
            op = sc.nextInt();
            if (op != -99) {
                n.getNum().add(op);
            }
        } while (op != -99);
    }

    public Integer calculateSum(Numbers n) {
        System.out.println("Calculating sum!");
        int sum = 0;
        for (Integer num : n.getNum()) {
            sum += num;
        }
        return sum;
    }
    
    public Double calculateProm(Numbers n) {
        System.out.println("Calculating average!");
        double av =(double) calculateSum(n)/n.getNum().size();
        return av;
    }
    
    public void showData(Numbers n) {
        System.out.println("Showing information:\nAmount of numbers entered: " +
                n.getNum().size() + "\nSum of the numbers: " + calculateSum(n) +
                "\nAverage of the numbers: " + calculateProm(n));
    }
}
