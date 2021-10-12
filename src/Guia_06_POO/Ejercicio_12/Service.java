package Guia_06_POO.Ejercicio_12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public void crearPersona(Persona p) throws ParseException {
        System.out.println("Ingrese su nombre: ");
        p.setName(sc.nextLine());
        System.out.println("Ingrese su fecha de nacimiento (dd MM yyyy): ");
//        SimpleDateFormat orden = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter orden = DateTimeFormatter.ofPattern("dd MM yyyy");
        p.setNac(LocalDate.parse(sc.nextLine(), orden));

//        Date date = new Date();
//        p.setNac(orden.parse(sc.nextLine() + " " + date.getHours() + " " + date.getMinutes() + " " + date.getSeconds()));
        System.out.println("Su fecha de nacimiento quedó registrada como: " + p.getNac());
    }

    public void calcularEdad(Persona p) {
        System.out.println("Calculando edad: ");
        LocalDate date = LocalDate.now();
//        Date date = new Date();
        if (p.getNac().getMonthValue() > date.getMonthValue() || (p.getNac().getMonthValue() == date.getMonthValue() && p.getNac().getDayOfMonth() >= date.getDayOfMonth())) {
            p.setAge(date.getYear() - p.getNac().getYear());
        } else {
            p.setAge(date.getYear() - p.getNac().getYear() - 1);
        }
        System.out.println("La persona tiene: " + p.getAge());
    }

    public boolean menorQue(Persona p1, Persona p2) {
        System.out.println("Calculando si la nueva edad es menor qué la anterior: ");
        if (p1.getNac().getYear() < p2.getNac().getYear()) {
            System.out.println("La edad de " + p1.getName() + " es menor qué: " + p2.getName());
            return true;
        } else {
            System.out.println("No es menor.");
            return false;
        }
    }

    public void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getName() + "\nFecha de nacimiento: " + p.getNac() + "\n Edad: " + p.getAge());
    }
}
