package model;

public class Motorcycle extends Vehicle{
    private String engineType;


    public Motorcycle(String plateNumber, String ownerName, String vehicleType, int regestrationYear, String status, String engineType) {
        super(plateNumber, ownerName, vehicleType, regestrationYear, status);
        this.engineType = engineType;
    }

    @Override
    public String getRegistrationLabel() {
        return "Motorcycle — Engine: "+engineType;
    }

    @Override
    public String toString() {
        return super.toString() + " | "+getRegistrationLabel();
    }
}
