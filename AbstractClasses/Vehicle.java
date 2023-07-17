package JavaAdvanced.DevelhopeJavaAdvanced.AbstractClasses;

public abstract class Vehicle {
    String type;
    int numberOfWheels;

    public void showVehicleDetails(){
      System.out.println("The vehicle is a " + type + " and has " + numberOfWheels + " wheels!");
  }

    public abstract void doVehicleSound();



}
