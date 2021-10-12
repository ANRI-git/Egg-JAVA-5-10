package Guia_09_HER.Ejercicio_02_03;

public class Television extends HouseholdAppliance {

    private Double resolution;
    private Boolean TDT_Tuner;

    public Television() {
    }

    public Television(Double resolution, Boolean TDT_Tuner) {
        this.resolution = resolution;
        this.TDT_Tuner = TDT_Tuner;
    }

    public Television(Double resolution, Boolean TDT_Tuner, Double price, String color, Character electricalConsumption, Double weight) {
        super(price, color, electricalConsumption, weight);
        this.resolution = resolution;
        this.TDT_Tuner = TDT_Tuner;
    }

    public Double getResolution() {
        return resolution;
    }

    public void setResolution(Double resolution) {
        this.resolution = resolution;
    }

    public Boolean getTDT_Tuner() {
        return TDT_Tuner;
    }

    public void setTDT_Tuner(Boolean TDT_Tuner) {
        this.TDT_Tuner = TDT_Tuner;
    }

    public void createTV() {
        createAppliance();
        System.out.println("Enter the resolution (px):");
        resolution = sc.nextDouble();
        System.out.println("Does it have TDT Tuner? y/n:");
        TDT_Tuner = sc.next().equals("y");
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (resolution > 40) {
            price += price + (price * 0.3);
        }
        if (TDT_Tuner) {
            price += 500d;
        }
    }
}
