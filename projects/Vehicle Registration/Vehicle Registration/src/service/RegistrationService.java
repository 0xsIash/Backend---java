package service;

import model.Vehicle;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

public interface RegistrationService {
    boolean registerVehicle(Vehicle v);
    Vehicle findByPlate(String plate);
    boolean deleteVehicle(String plate);
    boolean updateOwner(String plate, String newOwner);
    List<Vehicle> getAllVehicles();
    List<Vehicle> filterByType(String type);
    List<Vehicle> getVehiclesByOwner(String ownerName);
    List<Vehicle> getExpiredRegistrations(int currentYear);
    List<Vehicle> getSortedByYear(boolean ascending);
    IntSummaryStatistics summaryStatistics();
    Map<String, Long> getVehiclesByType();
    Map<Boolean, Long> getVehiclesByStatus();
}
