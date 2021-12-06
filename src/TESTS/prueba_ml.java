package TESTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class prueba_ml {

    public static void main(String[] args) {
        //Crear un programa que detecte palabras repetidas, y que elimine solo 
        //las que tienen las mismas letras sin importar el orden, dejando solo las originales
        String[] listWords = {"wenas", "ewans", "holiwis", "foca", "siihlwo"};
        String[] listWords2 = {"wenas", "ewans"};
        String[] listWords3 = {"wenas", "ewans"};
        for (String listWord : listWords) {
            System.out.print(listWord);
            System.out.print(" - ");
        }
        System.out.println("");
        listWords = funcion(listWords);
//        for (String listWord : listWords) {
//            System.out.print(listWord);
//            System.out.print(" - ");
//        }
    }

    public static String[] funcion(String[] lw) {
        List<String> auxLw = new ArrayList(Arrays.asList(lw));
        Iterator<String> it = auxLw.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String string : lw) {
                char charArray[] = next.toCharArray();
                char charArray2[] = string.toCharArray();
                Arrays.sort(charArray);
                Arrays.sort(charArray2);
                System.out.println(next);
                System.out.println(string);
                System.out.println("son iguales los originales:" + (next.equals(string)));
                System.out.println(charArray);
                System.out.println(charArray2);
                System.out.println("son iguales los caracteres:" + (Arrays.equals(charArray, charArray2)));
                if (!(next.equals(string)) && (Arrays.equals(charArray, charArray2))) {
                    it.remove();
                    System.out.println("removed");
                    break;
                }
            }
        }
        System.out.println("");
        for (String listWord : auxLw) {
            System.out.print(listWord);
            System.out.print(" - ");
        }
        return auxLw.toArray(new String[auxLw.size()]);
    }

}
