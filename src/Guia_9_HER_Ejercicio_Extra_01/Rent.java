package Guia_9_HER_Ejercicio_Extra_01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rent {

    private String name;
    private Long DNI;
    private LocalDateTime rentDate;
    private LocalDateTime devolutionDate;
    private Integer mooringPosition;
    private Boat ship;
    private Double price;

    public Rent() {
    }

    public Rent(String name, Long DNI, LocalDateTime rentDate, LocalDateTime devolutionDate, Integer mooringPosition, Boat ship, Double price) {
        this.name = name;
        this.DNI = DNI;
        this.rentDate = rentDate;
        this.devolutionDate = devolutionDate;
        this.mooringPosition = mooringPosition;
        this.ship = ship;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDateTime getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(LocalDateTime devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Integer getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(Integer mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Boat getShip() {
        return ship;
    }

    public void setShip(Boat ship) {
        this.ship = ship;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
