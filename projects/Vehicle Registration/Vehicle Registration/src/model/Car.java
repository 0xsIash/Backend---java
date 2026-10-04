package model;

public class Car extends Vehicle{
    private int numberOfDoors ;

    public Car(String plateNumber, String ownerName, String vehicleType, int regestrationYear, String status, int numberOfDoors) {
        super(plateNumber, ownerName, vehicleType, regestrationYear, status);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationLabel() {
        return "Passenger Car — Doors: "+numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + " | "+getRegistrationLabel();
    }
}
