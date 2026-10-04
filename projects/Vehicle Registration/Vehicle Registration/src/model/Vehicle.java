package model;

public abstract class Vehicle {
    private final String plateNumber;
    private String ownerName;
    private final String vehicleType;
    private final int registrationYear;
    private String status;


    public Vehicle(String plateNumber, String ownerName, String vehicleType, int registrationYear, String status) {
        this.plateNumber = plateNumber.toUpperCase();
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationYear = registrationYear;
        this.status = status.toUpperCase();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public int getRegistrationYear() {
        return registrationYear;
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
        return "\n["+plateNumber+"] | "+vehicleType+" | Owner: "+ownerName+" | Year: "+registrationYear+" | Status: "+status;
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
