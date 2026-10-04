package util;

import exception.InvalidInputException;

public class InputValidator {
    public void validatePlateNumber(String plateNumber) {
        if (plateNumber == null || !plateNumber.matches("[a-zA-Z0-9-]{3,10}")) {
            throw new InvalidInputException("Plate number must be 3-10 alphanumeric characters");
        }
    }

    public void validateVehicleType(String type){

        if (type == null || !type.equalsIgnoreCase("Car")
                && !type.equalsIgnoreCase("Truck")
                && !type.equalsIgnoreCase("Motorcycle")) {
            throw new InvalidInputException("Vehicle type must be Car, Truck, or Motorcycle");
        }
    }

    public void validateOwnerName(String name){
        if (name == null || name.isEmpty()) {
            throw new InvalidInputException("Owner Name must be 3-15 characters");
        }

        if (!name.matches("[a-zA-Z _]{3,15}")) {
            throw new InvalidInputException("Owner Name must be 3-15 characters");
        }
    }

    public void validateYear(int year){
        if (year < 1990 || year > 2026) {
            throw new InvalidInputException("Registration year must be between 1990 and 2026");
        }
    }

    public void validateStatus(String status){
        if (status == null || status.isEmpty()) {
            throw new InvalidInputException("Status must be ACTIVE/INACTIVE");
        }

        if (!status.equalsIgnoreCase("active")
                && !status.equalsIgnoreCase("inactive")) {
            throw new InvalidInputException("Status must be ACTIVE/INACTIVE");
        }
    }

    public void validateNumberOfDoors(int numberOfDoors) {
        if (!(numberOfDoors == 2 || numberOfDoors == 4)) {
            throw new InvalidInputException("Number of doors must be 2 or 4");
        }
    }

    public void validateEngineType(String type){
        if (!type.equalsIgnoreCase("Sport")
                && !type.equalsIgnoreCase("Cruiser")
                && !type.equalsIgnoreCase("Off-Road")) {
            throw new InvalidInputException("Engine type must be Sport, Cruiser, or Motorcycle");
        }
    }

}
