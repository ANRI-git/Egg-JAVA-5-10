package Guia_09_HER.Ejercicio_Extra_01;

public class Boat {

    protected Double licensePlate;
    protected Double length;
    protected Integer year;

    public Boat() {
    }

    public Boat(Double licensePlate, Double length, Integer year) {
        this.licensePlate = licensePlate;
        this.length = length;
        this.year = year;
    }

    public Double getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(Double licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Boat";
    }

}
