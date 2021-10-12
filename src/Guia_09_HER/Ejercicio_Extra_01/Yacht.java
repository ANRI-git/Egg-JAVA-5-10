package Guia_09_HER.Ejercicio_Extra_01;

public class Yacht extends Motorboat {

    private Integer rooms;

    public Yacht() {
    }

    public Yacht(Integer rooms) {
        this.rooms = rooms;
    }

    public Yacht(Integer rooms, Double HP) {
        super(HP);
        this.rooms = rooms;
    }

    public Yacht(Integer rooms, Double HP, Double licensePlate, Double length, Integer year) {
        super(HP, licensePlate, length, year);
        this.rooms = rooms;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Yacht";
    }
}
