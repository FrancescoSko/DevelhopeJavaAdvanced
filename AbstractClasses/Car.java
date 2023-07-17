package JavaAdvanced.DevelhopeJavaAdvanced.AbstractClasses;

public class Car extends Vehicle{
private int numberOfDoors;
private double carPrice;
    public Car (int numberOfDoors, double carPrice){
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
        type = "Car";
        numberOfWheels = 4;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The car has " + numberOfDoors + " doors");
    }

    @Override
     public void doVehicleSound() {
         System.out.println("Vroooom");
    }
}
