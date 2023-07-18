package JavaAdvanced.DevelhopeJavaAdvanced.AbstractClasses;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
     Car car = new Car(5, 40000, "Car", 4);
        car.doVehicleSound();
        car.showVehicleDetails();

     Boat boat = new Boat(125, 8500, "Boat");
      boat.doVehicleSound();
      boat.showVehicleDetails();
      System.out.println(boat.getBoatWeightAndSpeed());
    }
}
