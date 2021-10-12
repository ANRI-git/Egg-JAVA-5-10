package TESTS;

import java.util.Scanner;

public class Plantilla_menu {

    public void plantilla() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Integer op;
        do {
            System.out.println("1. .\n2. .\n3. .\n4. .\n5. .\n0. ");
            while(!sc.hasNextInt()) {
                System.out.println("Not a number!\n try again.");
                sc.next();
            }
            op = sc.nextInt();
            switch (op) {
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                    break;
                case 0:
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        } while (!op.equals(0));
    }

}
