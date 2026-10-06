import model.Car;
import model.Motorcycle;
import model.Truck;
import model.Vehicle;
import service.Impl.ApplicationServiceImpl;
import service.Impl.RegistrationServiceImpl;
import service.RegistrationService;

void main() {
    Scanner scanner = new Scanner(System.in);
    ApplicationServiceImpl service = new ApplicationServiceImpl(scanner);


    int count = 0;
    System.out.println("====================================");
    System.out.println("VEHICLE REGISTRATION SYSTEM  v1.0");
    while (true){
        System.out.println("====================================");
        System.out.println("1. Register New Vehicle                  \n" +
                "2. Search Vehicle by Plate               \n" +
                "3. Update Owner Name                     \n" +
                "4. Delete Vehicle                        \n" +
                "5. List All Vehicles                     \n" +
                "6. Filter by Vehicle Type                \n" +
                "7. Show Owner History                    \n" +
                "8. Show Expired Registrations            \n" +
                "9. Statistics Report                     \n" +
                "0. Exit ");
        System.out.println("====================================");
        System.out.print("Enter your choice: ");
        try{
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // register new vehicle
                    if(service.register()){
                        System.out.println("Vehicle add successfully");
                    }
                    break;
                case 2:
                    // Search Vehicle
                    Vehicle vehicle  = service.searchByPlate();
                    if(vehicle  != null){
                        System.out.println(vehicle );
                    }
                    break;
                case 3:
                    // update owner name
                    service.updateOwnerName();
                    break;
                case 4:
                    // delete vehicle
                    service.deleteVehicle();
                    break;
                case 5:
                    // all vehicle
                    service.listVehicles();
                    break;
                case 6:
                    // filter by type
                    service.filterByType();
                    break;
                case 7:
                    // owner history
                    service.ownerHistory();
                    break;
                case 8:
                    // Expired Registrations
                    service.expiredRegistrations();
                    break;
                case 9:
                    // report
                    service.printStatistics();
                    break;
                case 0:
                    System.out.println("Have a nice day :)");
                    return;
                default:
                    System.out.println("\nInvalid input. please choose number between (1-9)\n");
                    count++;
                    break;
            }
        }catch (InputMismatchException e) {

            scanner.nextLine();
            System.out.println("\nInvalid input. please choose number between (1-9)\n");
            count++;
        }

        if (count == 3) {

            System.out.println("\npls contact with Admin :(\n");
            break;
        }

    }

}
