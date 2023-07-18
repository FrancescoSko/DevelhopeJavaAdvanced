package JavaAdvanced.DevelhopeJavaAdvanced.AbstractClasses;

public class Boat extends Vehicle{
    private int maxKnotsSpeed;
    private double boatKilosWeight;

    public Boat (int maxKnotsSpeed, double boatKilosWeight, String type){
        this.type = type;
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;

    }


    public String getBoatWeightAndSpeed(){
        return "The speed of the boat is: " + maxKnotsSpeed + " and is weight is: " + boatKilosWeight + " kilos";
    }


    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
    }

    @Override
    public void doVehicleSound() {
        System.out.println("BRUMBRUMBRUM");
    }


}
