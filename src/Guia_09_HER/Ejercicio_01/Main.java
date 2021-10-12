package Guia_09_HER.Ejercicio_01;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Chiquito", "meat", 3, "Doberman");
        Animal dog1 = new Dog("Roger", "Vegetables", 1, "Pitbull");
        Animal cat = new Cat("Francisca", "cat food", 4, "American cat");
        Animal horse = new Horse("Spirit", "grass", 2, "American Mustang");
        
        dog.feed();
        dog1.feed();
        cat.feed();
        horse.feed();
    }

}
