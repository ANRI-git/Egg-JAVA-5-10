package Guia_9_HER_Ejercicio_Extra_02;

public class Office extends Building{

    private Integer numOffices;
    private Integer numPeople;
    private Integer numFloors;

    public Office() {
    }

    public Office(Integer numOffices, Integer numPeople, Integer numFloors) {
        this.numOffices = numOffices;
        this.numPeople = numPeople;
        this.numFloors = numFloors;
    }

    public Office(Integer numOffices, Integer numPeople, Double height, Double width, Double length, Integer numFloors) {
        super(height, width, length);
        this.numOffices = numOffices;
        this.numPeople = numPeople;
        this.numFloors = numFloors;
    }

    public Integer getNumOffices() {
        return numOffices;
    }

    public void setNumOffices(Integer numOffices) {
        this.numOffices = numOffices;
    }

    public Integer getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(Integer numPeople) {
        this.numPeople = numPeople;
    }

    public Integer getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(Integer numFloors) {
        this.numFloors = numFloors;
    }
    
    @Override
    public Double calculateSurface() {
        Double surface = this.width * this.length;
        return surface;
    }

    @Override
    public Double calculateVolume() {
        Double volume = this.width * this.length * this.height;
        return volume;
    }

    @Override
    public String toString() {
        return "office";
    }
    
    
}
