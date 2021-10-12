package Guia_8_REL_Ejercicio_Extra_02;


public class Vehicle {
    private String brand;
    private String model;
    private Integer year;
    private Integer motorNum;
    private String chassis;
    private String color;
    private String type;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year, Integer motorNum, String chassis, String color, String type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.motorNum = motorNum;
        this.chassis = chassis;
        this.color = color;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMotorNum() {
        return motorNum;
    }

    public void setMotorNum(Integer motorNum) {
        this.motorNum = motorNum;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
