package Guia_9_HER_Ejercicio_02_03;

public class WashingMachine extends HouseholdAppliance {

    private Double charge;

    public WashingMachine() {
    }

    public WashingMachine(Double charge, Double price, String color, Character electricalConsumption, Double weight) {
        super(price, color, electricalConsumption, weight);
        this.charge = charge;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public void createWashingMachine() {
        createAppliance();
        System.out.println("Enter the charge:");
        charge = sc.nextDouble();
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (charge > 30) {
            this.price += 500d;
        }
    }
}
