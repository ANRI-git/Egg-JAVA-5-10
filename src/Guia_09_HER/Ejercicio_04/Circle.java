package Guia_9_HER_Ejercicio_04;

public class Circle implements formsCalculator {

    private Double radius;
    private Double diameter;

    public Circle() {
    }

    public Circle(Double radius, Double perimeter) {
        this.radius = radius;
        this.diameter = perimeter;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
        this.diameter = radius * 2 * Math.PI;
    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("%1.2f%n",PI * diameter);
    }

    @Override
    public void calculateArea() {
        System.out.printf("%1.2f%n",PI * Math.pow(radius, 2));
    }

}
