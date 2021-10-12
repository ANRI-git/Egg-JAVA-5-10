package Guia_9_HER_Ejercicio_Extra_01;

public class Sailboat extends Boat {

    private Integer num_mast;

    public Sailboat() {
    }

    public Sailboat(Integer num_mast) {
        this.num_mast = num_mast;
    }

    public Sailboat(Integer num_mast, Double licensePlate, Double length, Integer year) {
        super(licensePlate, length, year);
        this.num_mast = num_mast;
    }

    public Integer getNum_mast() {
        return num_mast;
    }

    public void setNum_mast(Integer num_mast) {
        this.num_mast = num_mast;
    }

    @Override
    public String toString() {
        return "Sailboat";
    }
}
