package service.Impl;

import model.Car;
import model.Motorcycle;
import model.Truck;
import model.Vehicle;
import service.ApplicationService;
import util.InputValidator;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {
    private final Scanner scanner;
    private Vehicle vehicle;
    RegistrationServiceImpl service = new RegistrationServiceImpl();
    InputValidator inputValidator = new InputValidator();

    public ApplicationServiceImpl(Scanner scanner) {
        this.scanner = scanner;
        loadVehicles();
    }

    public void loadVehicles(){
        Car c1 = new Car("CAR-001", "Ahmed Ali","car",2019, "EXPIRED", 4);
        Car c2 = new Car("CAR-002", "Sara Kamel","car",2023, "ACTIVE",  2);
        Truck t1 =new Truck("TRK-001", "Mohamed Said","truck", 2021, "ACTIVE", 10.0);
        Truck t2 =new Truck("TRK-002", "Laila Nour","truck",2017, "EXPIRED", 5.5);
        Motorcycle m1 = new Motorcycle("MOT-001", "Omar Fathi","motorcycle",2022, "ACTIVE", "Sport");
        Motorcycle m2 = new Motorcycle("MOT-002", "Nadia Hamed","motorcycle",2024, "ACTIVE", "Cruiser");

        service.registerVehicle(c1);
        service.registerVehicle(c2);
        service.registerVehicle(t1);
        service.registerVehicle(t2);
        service.registerVehicle(m1);
        service.registerVehicle(m2);
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
        return service.findByPlate(plate);
    }



    public void updateOwnerName(){
        System.out.print("Plate number: ");
        String plate = scanner.nextLine();
        System.out.print("New owner name: ");
        String newName = scanner.nextLine();
        inputValidator.validateOwnerName(newName);
        if(service.updateOwner(plate,newName))
        {
            System.out.println("Name updated successfully!");
        }

    }

    public void deleteVehicle(){
        System.out.print("Plate number: ");
        String plate = scanner.nextLine();

        if(service.deleteVehicle(plate)) {
            System.out.println("Vehicle deleted successfully!");
        }
    }

    public void listVehicles(){
        if(service.getAllVehicles().isEmpty()){
            System.out.println("No vehicles found!");
        }
        else {
            System.out.println(service.getAllVehicles());
        }
    }


    public void filterByType(){
        System.out.print("Vehicle Type: ");
        String type = scanner.nextLine();
        if(service.filterByType(type).isEmpty()){
            System.out.println("No vehicles found!");
        }
        else{
            System.out.println(service.filterByType(type));
        }
    }

    public void ownerHistory(){
        System.out.print("Owner name: ");
        String name = scanner.nextLine();
        if(service.getVehiclesByOwner(name).isEmpty()){
            System.out.println("No vehicles found!");
        }
        else {
            System.out.println(service.getVehiclesByOwner(name));
        }
    }

    public void expiredRegistrations(){
        System.out.print("Current year: ");
        int year = scanner.nextInt();
        if(service.getExpiredRegistrations(year).isEmpty()){
            System.out.println("No vehicles found!");
        }
        else {
            System.out.println(service.getExpiredRegistrations(year));
        }
    }


    // statistics
    public void printStatistics() {

        IntSummaryStatistics stats = service.summaryStatistics();
        Map<String, Long> byType = service.getVehiclesByType();
        Map<Boolean, Long> byStatus = service.getVehiclesByStatus();

        System.out.println("========== REGISTRATION STATISTICS ==========");

        System.out.println("Total Vehicles  : " + stats.getCount());
        System.out.println("Average Year    : " + Math.round(stats.getAverage()));
        System.out.println("Newest Vehicle  : " + (stats.getCount() == 0 ? 0 : stats.getMax()));
        System.out.println("Oldest Vehicle  : " + (stats.getCount() == 0 ? 0 : stats.getMin()));

        System.out.println("---------------------------------------------");

        System.out.println("Vehicles by Type:");
        System.out.println("  Car          : " + byType.getOrDefault("car", 0L));
        System.out.println("  Truck        : " + byType.getOrDefault("truck", 0L));
        System.out.println("  Motorcycle   : " + byType.getOrDefault("motorcycle", 0L));

        System.out.println("---------------------------------------------");

        System.out.println("ACTIVE vehicles : " + byStatus.getOrDefault(true, 0L));
        System.out.println("EXPIRED vehicles: " + byStatus.getOrDefault(false, 0L));

        System.out.println("=============================================");
    }

}
