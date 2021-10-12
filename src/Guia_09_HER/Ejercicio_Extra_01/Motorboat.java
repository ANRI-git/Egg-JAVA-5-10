package Guia_09_HER.Ejercicio_Extra_01;

public class Motorboat extends Boat {

    private Double HP;

    public Motorboat() {
    }

    public Motorboat(Double HP) {
        this.HP = HP;
    }

    public Motorboat(Double HP, Double licensePlate, Double length, Integer year) {
        super(licensePlate, length, year);
        this.HP = HP;
    }

    public Double getHP() {
        return HP;
    }

    public void setHP(Double HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return "MotorBoat";
    }
}
