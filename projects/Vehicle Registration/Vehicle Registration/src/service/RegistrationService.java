package service;

import exception.DuplicatePlateException;
import exception.VehicleNotFoundException;
import model.Vehicle;

import java.util.*;

public class RegistrationService {
    private List<Vehicle> vehicleList = new ArrayList<>();
    private Map<String, Vehicle> plateIndex = new HashMap<>();
    private Set<String> registeredPlates = new HashSet<>();


    // register a new vehicle
    public boolean registerVehicle(Vehicle v){
        try{
            if (registeredPlates.contains(v.getPlateNumber())) {
                throw new DuplicatePlateException(v.getPlateNumber());
            }
            vehicleList.add(v);
            plateIndex.put(v.getPlateNumber(), v);
            registeredPlates.add(v.getPlateNumber());
            return true;
        }catch (DuplicatePlateException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    // find a vehicle
    public Vehicle findByPlate(String plate){
        plate = plate.toUpperCase();
        if(!plateIndex.containsKey(plate)){
            throw new VehicleNotFoundException(plate);
        }
        return plateIndex.get(plate);
    }

    // delete a vehicle
    public boolean deleteVehicle(String plate){
        try {
            Vehicle v = findByPlate(plate);
            vehicleList.remove(v);
            plateIndex.remove(plate.toUpperCase());
            registeredPlates.remove(plate.toUpperCase());
            return true;
        }catch (VehicleNotFoundException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    // update owner name
    public boolean updateOwner(String plate, String newOwner){
        try {
            Vehicle v = findByPlate(plate);
            v.setOwnerName(newOwner);
            return true;
        }catch (VehicleNotFoundException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    // get all vehicles
    public List getAllVehicles(){
        return Collections.unmodifiableList(vehicleList);
    }
}
