import model.Car;
import model.Motorcycle;
import model.Truck;
import model.Vehicle;
import service.RegistrationService;

void main() {
    Vehicle a = new Car("abc-001", "Ali","Car", 2021, "ACTIVE", 4);
    Vehicle b = new Car("abc-002", "Ali","Car", 2021, "ACTIVE", 4);
    Vehicle c = new Car("abc-003", "Ali","Car", 2021, "ACTIVE", 4);
    Vehicle d = new Car("abc-004", "Ali","Car", 2021, "ACTIVE", 4);

    RegistrationService r = new RegistrationService();
    if(r.registerVehicle(a)){
        System.out.println("done");
    }if(r.registerVehicle(b)){
        System.out.println("done");
    }if(r.registerVehicle(b)){
        System.out.println("done");
    }if(r.registerVehicle(c)){
        System.out.println("done");
    }

    List<Vehicle> vehicles = r.getAllVehicles();
    System.out.println(vehicles);


}
