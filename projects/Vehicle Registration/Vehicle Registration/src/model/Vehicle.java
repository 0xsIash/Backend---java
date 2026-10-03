package model;

public abstract class Vehicle {
    private  String plateNumber;
    private String ownerName;
    private String vehicleType;
    private int regestrationYear;
    private String status;


    public Vehicle(String plateNumber, String ownerName, String vehicleType, int regestrationYear, String status) {
        this.plateNumber = plateNumber.toUpperCase();
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regestrationYear = regestrationYear;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public int getRegestrationYear() {
        return regestrationYear;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }


    @Override
    public String toString() {
        return "["+plateNumber+"] | "+vehicleType+" | Owner: "+ownerName+" | Year: "+regestrationYear+" | Status: "+status;
    }

    public abstract String getRegistrationLabel();

    @Override
    public int hashCode() {
        return plateNumber.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return plateNumber.equalsIgnoreCase(vehicle.plateNumber);
    }
}
