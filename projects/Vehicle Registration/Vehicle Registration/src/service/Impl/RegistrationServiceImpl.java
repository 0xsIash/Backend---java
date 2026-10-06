package service.Impl;

import exception.DuplicatePlateException;
import exception.VehicleNotFoundException;
import model.Vehicle;
import service.RegistrationService;

import java.util.*;
import java.util.stream.Collectors;

public class RegistrationServiceImpl implements RegistrationService {
    private final List<Vehicle> vehicleList = new ArrayList<>();
    private final Map<String, Vehicle> plateIndex = new HashMap<>();
    private final Set<String> registeredPlates = new HashSet<>();


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
    public Vehicle findByPlate(String plate) {
        try {
            plate = plate.toUpperCase();

            if (!plateIndex.containsKey(plate)) {
                throw new VehicleNotFoundException(plate);
            }

            return plateIndex.get(plate);

        } catch (VehicleNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // delete a vehicle
    public boolean deleteVehicle(String plate){
        Vehicle v = findByPlate(plate);
        if(v != null) {
            vehicleList.remove(v);
            plateIndex.remove(plate.toUpperCase());
            registeredPlates.remove(plate.toUpperCase());
            return true;
        }

        return false;

    }

    // update owner name
    public boolean updateOwner(String plate, String newOwner){
        Vehicle v = findByPlate(plate);
        if(v != null) {
            v.setOwnerName(newOwner);
            return true;
        }

        return false;
    }

    // get all vehicles
    public List<Vehicle> getAllVehicles(){
        return Collections.unmodifiableList(vehicleList);
    }

    // filter by type
    public List<Vehicle> filterByType(String type){
        return vehicleList.stream().filter(v -> v.getVehicleType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    // Get Vehicles By Owner
    public List<Vehicle> getVehiclesByOwner(String ownerName){
        return vehicleList.stream().filter(v -> v.getOwnerName().equalsIgnoreCase(ownerName))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getExpiredRegistrations(int currentYear){
        return vehicleList.stream()
                .filter(v -> (currentYear - v.getRegistrationYear()) > 5)
                .sorted(Comparator.comparingInt(Vehicle::getRegistrationYear))
                .collect(Collectors.toList());
    }


    public List<Vehicle> getSortedByYear(boolean ascending){
        Comparator<Vehicle> comp = Comparator.comparingInt(Vehicle::getRegistrationYear);
        if (!ascending) comp = comp.reversed();
        return vehicleList.stream().sorted(comp).collect(Collectors.toList());
    }

    // Statistics

    public IntSummaryStatistics summaryStatistics(){
        return vehicleList.stream()
                .mapToInt(Vehicle::getRegistrationYear)
                .summaryStatistics();

    }

    public Map<String, Long> getVehiclesByType(){
        return vehicleList.stream()
                .collect(Collectors.groupingBy(
                        v -> v.getVehicleType().toLowerCase(),
                        Collectors.counting()
                ));
    }

    public Map<Boolean, Long> getVehiclesByStatus(){
        return vehicleList.stream()
                .collect(Collectors.partitioningBy(
                        v -> v.getStatus().equals("ACTIVE"),
                        Collectors.counting()));
    }


}
