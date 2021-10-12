package Guia_06_POO.Ejercicio_08;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service serv = new Service();
        Cadena cad1 = new Cadena();
        
        System.out.println("Ingrese una frase o palabra a continuación:");
        cad1.setFrase(sc.nextLine());
        cad1.setLongitud(cad1.getFrase().length());
        serv.mostrarVocales(cad1);
        serv.invertirFrase(cad1);
        System.out.println("Ingrese una letra para buscar:");
        serv.vecesReperido(cad1, sc.nextLine());
        System.out.println("Ingrese una nueva frase para comparar longitud:");
        serv.compararLongitud(cad1, sc.nextLine());
        System.out.println("Ingrese una nueva frase para unirlas:");
        serv.unirFrases(cad1, sc.nextLine());
        System.out.println("Ingrese una letra para reemplazar la 'a':");
        serv.reemplazar(cad1, sc.nextLine());
        System.out.println("Ingrese una letra para buscar:");
        System.out.println(serv.contiene(cad1, sc.nextLine()));
    }

}
