package service.Impl;

import model.Car;
import model.Motorcycle;
import model.Truck;
import model.Vehicle;
import service.ApplicationService;
import util.InputValidator;

import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {
    private final Scanner scanner;
    private Vehicle vehicle;
    RegistrationServiceImpl service = new RegistrationServiceImpl();
    InputValidator inputValidator = new InputValidator();

    public ApplicationServiceImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean register(){
        boolean added = false;
        try{
            // validate plate
            System.out.print("Plate Number: ");
            String plate = scanner.nextLine();
            inputValidator.validatePlateNumber(plate);

            // validate type
            System.out.print("Vehicle Type: ");
            String type = scanner.nextLine();
            inputValidator.validateVehicleType(type);

            // validate owner
            System.out.print("Owner Name: ");
            String name = scanner.nextLine();
            inputValidator.validateOwnerName(name);

            // validate year
            System.out.print("Registration Year: ");
            int year = scanner.nextInt();
            inputValidator.validateYear(year);

            scanner.nextLine();

            // validate status
            System.out.print("Status: ");
            String status = scanner.nextLine();
            inputValidator.validateStatus(status);

            // create vehicle
            if (type.equalsIgnoreCase("car")) {
                System.out.print("Number of doors: ");
                int doors = scanner.nextInt();
                inputValidator.validateNumberOfDoors(doors);
                vehicle = new Car(plate, name, type, year, status, doors);

            } else if (type.equalsIgnoreCase("truck")) {
                System.out.print("Cargo capacity tons: ");
                double cargoCapacityTons = scanner.nextDouble();
                vehicle = new Truck(plate, name, type, year, status, cargoCapacityTons);

            } else if (type.equalsIgnoreCase("motorcycle")) {
                System.out.print("Engine type: ");
                String engineType = scanner.nextLine();
                inputValidator.validateEngineType(engineType);
                vehicle = new Motorcycle(plate, name, type, year, status, engineType);
            }


        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return false;
        }

        return service.registerVehicle(vehicle);

    }

    public Vehicle searchByPlate(){
        System.out.print("Plate number: ");
        String plate = scanner.nextLine();
        Vehicle vehicle =service.findByPlate(plate);
        if( vehicle != null){
            return vehicle;
        }
        return null;
    }

    public void updateOwnerName(){
        Vehicle vehicle = searchByPlate();
        if(vehicle!=null){
            System.out.print("New owner name: ");
            String newName = scanner.nextLine();
            inputValidator.validateOwnerName(newName);
            vehicle.setOwnerName(newName);
            System.out.println("Name updated successfully!");
        }
    }

    public void deleteVehicle(){
        System.out.print("Plate number: ");
        String plate = scanner.nextLine();
        service.deleteVehicle(plate);
        System.out.println("Vehicle deleted successfully!");
    }

    public void listVehicles(){
        System.out.println(service.getAllVehicles());
    }
}
