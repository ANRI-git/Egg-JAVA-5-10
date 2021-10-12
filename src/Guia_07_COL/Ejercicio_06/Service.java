package Guia_7_COL_Ejercicio_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menuStore() {
        HashMap<Integer, Product> listProduct = new HashMap();
        System.out.println("Welcome!\nFirst enter the list of products of the store:");
        System.out.println("Creating list of products:");
        createListProducts(listProduct);
        int op;
        do {
            System.out.println("1. Add new products.\n2. Modify price of product.\n3. Delete product.\n4. Show list of products.\n0. Exit.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    createListProducts(listProduct);
                    break;
                case 2:
                    modifyPrice(listProduct);
                    break;
                case 3:
                    deleteProduct(listProduct);
                    break;
                case 4:
                    showList(listProduct);
                    break;
                case 0:
                    System.out.println("Thanks for using our services!");
                    ;
                    break;
                default:
                    System.out.println("Wrong option!");
                    ;
                    break;
            }
        } while (op != 0);
    }

    public void createListProducts(HashMap<Integer, Product> lP) {
        String op = "y";
        do {
            switch (op) {
                case "y":
                    Product p = new Product();
                    System.out.println("Enter the name of the product:");
                    p.setName(sc.next());
                    System.out.println("Enter the price of the product:");
                    p.setPrice(sc.nextDouble());
                    int aux;
                    do {
                        aux = (int) (Math.random() * Integer.MAX_VALUE);
//                        aux1 = 0;
//                        aux = sc.nextInt();
//                        System.out.println(aux + "\n" + aux1);
                        if (!lP.containsKey(aux)) {
                            lP.put(aux, p);
//                            aux1 = 1;
                            break;
                        }
                    } while (true);
                    System.out.println("Barcode asignated: " + aux);
                    System.out.println("Add new product? (y/n)");
                    op = sc.next();
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Wrong option!");
                    System.out.println("Add new product? (y/n)");
                    op = sc.next();
                    break;
            }
        } while (!op.equalsIgnoreCase("n"));
    }

    public void deleteProduct(HashMap<Integer, Product> lP) {
        String op = "y";
        Integer aux;
        do {
            switch (op) {
                case "y":
                    showList(lP);
                    System.out.println("Enter the barcode of the product:");
                    aux = sc.nextInt();
                    if (lP.containsKey(aux)) {
                        lP.remove(aux);
                    } else {
                        System.out.println("Product not found!");
                    }
                    System.out.println("Delete another product? (y/n)");
                    op = sc.next();
                case "n":
                    break;
                default:
                    System.out.println("Wrong option!");
                    System.out.println("Modify another price? (y/n)");
                    op = sc.next();
                    break;
            }
        } while (!op.equalsIgnoreCase("n"));
    }

    public void modifyPrice(HashMap<Integer, Product> lP) {
        String op = "y";
        Integer aux;
        do {
            switch (op) {
                case "y":
                    showList(lP);
                    System.out.println("Enter the barcode of the product:");
                    aux = sc.nextInt();
                    for (Map.Entry<Integer, Product> entry : lP.entrySet()) {
                        Integer key = entry.getKey();
                        Product obj = entry.getValue();
                        if (Objects.equals(key, aux)) {
                            System.out.println("Enter the new price:");
                            obj.setPrice(sc.nextDouble());
                        }
                        System.out.println("Modify another price? (y/n)");
                        op = sc.next();
                    }
                case "n":
                    break;
                default:
                    System.out.println("Wrong option!");
                    System.out.println("Modify another price? (y/n)");
                    op = sc.next();
                    break;
            }
        } while (!op.equalsIgnoreCase("n"));
    }

    public void showList(HashMap<Integer, Product> lP) {
        for (Map.Entry<Integer, Product> entry : lP.entrySet()) {
            Integer key = entry.getKey();
            Product value = entry.getValue();
            System.out.println("product: " + value.getName() + " price: $" + value.getPrice() + " barcode: " + key);
        }
    }

}
