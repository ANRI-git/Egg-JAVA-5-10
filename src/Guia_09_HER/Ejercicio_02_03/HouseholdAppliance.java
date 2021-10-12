package Guia_09_HER.Ejercicio_02_03;

import java.util.Scanner;

public class HouseholdAppliance {

    protected Double price;
    protected String color;
    protected Character electricalConsumption;
    protected Double weight;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public HouseholdAppliance() {
    }

    public HouseholdAppliance(Double price, String color, Character electricalConsumption, Double weight) {
        this.price = price;
        this.color = color;
        this.electricalConsumption = electricalConsumption;
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Character getElectricConsumption() {
        return electricalConsumption;
    }

    public Double getWeight() {
        return weight;
    }

    public void checkElectricalConsumption(char c) {
        String charElectric = "ABCDEF";
        for (int i = 0; i < charElectric.length(); i++) {
            if (charElectric.charAt(i) == Character.toUpperCase(c)) {
                electricalConsumption = c;
                break;
            } else {
                electricalConsumption = 'F';
            }
        }
    }

    public void checkColor(String color) {
        if (color.equalsIgnoreCase("white") || color.equalsIgnoreCase("black") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("grey")) {
            this.color = color;
        } else {
            this.color = "white";
        }
    }

    public void createAppliance() {
        System.out.println("Enter the information of the Appliance:");
        System.out.println("electricalConsumption (A, B, C, D, E, F):");
        String c = sc.next();
        checkElectricalConsumption(c.charAt(0));
        System.out.println("Color (white, black, red, blue, grey):");
        String col = sc.next();
        checkColor(col);
        System.out.println("weight (kg):");
        Double w = sc.nextDouble();
        weight = w;
        price = 1000d;
    }

    public void finalPrice() {
        switch (Character.toUpperCase(electricalConsumption)) {
            case 'A':
                price += 1000d;
                break;
            case 'B':
                price += 800d;
                break;
            case 'C':
                price += 600d;
                break;
            case 'D':
                price += 500d;
                break;
            case 'E':
                price += 300d;
                break;
            case 'F':
                price += 100d;
                break;
            default:
                break;
        }
        if (weight > 1 && weight < 20) {
            price += 100d;
        } else if (weight >= 20 && weight < 50) {
            price += 500d;
        } else if (weight >= 50 && weight < 80) {
            price += 500d;
        } else if (weight >= 80) {
            price += 500d;
        }
    }
}
