package Guia_09_HER.Ejercicio_02_03;

import java.util.ArrayList;

public class Service {

    ArrayList<HouseholdAppliance> appliance = new ArrayList();

    public void createNewAppliance() {
        WashingMachine wm = new WashingMachine(15d, 1000d, "white", 'B', 66d);
        WashingMachine wm1 = new WashingMachine(10d, 1000d, "grey", 'C', 70d);
        Television tv = new Television(44d, true, 1000d, "black", 'D', 10d);
        Television tv1 = new Television(32d, false, 1000d, "grey", 'A', 10d);
        appliance.add(wm);
        appliance.add(wm1);
        appliance.add(tv);
        appliance.add(tv1);
        for (HouseholdAppliance app : appliance) {
            app.finalPrice();
            System.out.println("Final price: " + app.price);
        }
    }
}
