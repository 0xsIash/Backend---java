package model;

public class Truck extends Vehicle{
    private double cargoCapacityTons;

    public Truck(String plateNumber, String ownerName, String vehicleType, int regestrationYear, String status,double cargoCapacityTons) {
        super(plateNumber, ownerName, vehicleType, regestrationYear, status);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    @Override
    public String getRegistrationLabel() {
        return "Commercial Truck — Cargo: "+cargoCapacityTons+" tons";
    }

    @Override
    public String toString() {
        return super.toString() + " | "+getRegistrationLabel();
    }
}
