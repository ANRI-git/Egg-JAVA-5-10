package Guia_9_HER_Ejercicio_04;

public class Square implements formsCalculator{

    private Double base;
    private Double height;

    public Square() {
    }

    public Square(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("%1.2f%n",(base + height) * 2);
    }

    @Override
    public void calculateArea() {
        System.out.printf("%1.2f%n",base * height);
    }

}
