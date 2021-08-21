package TESTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Conjuntos {

    public static void main(String[] args) {
        HashSet<Integer> numerosSet = new HashSet();
        ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
        Collections.sort(numerosLista);

        HashMap<Integer, String> alumnos = new HashMap();
        TreeMap <Integer, String> alumnosTree = new TreeMap(alumnos);
        
        alumnos.put(2, "wenas");
        alumnos.put(Integer.SIZE, "holas");
        
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key= " + key + "value= " + value);
        }
    }

}
