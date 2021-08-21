package Guia_9_HER_Ejercicio_Extra_02;

public abstract class Building {

    protected Double height;
    protected Double width;
    protected Double length;

    public Building() {
    }

    public Building(Double height, Double width, Double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    abstract Double calculateVolume();
    abstract Double calculateSurface();
}
