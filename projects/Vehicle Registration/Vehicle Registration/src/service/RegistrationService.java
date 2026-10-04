package service;

import model.Vehicle;

import java.util.List;

public interface RegistrationService {
    public boolean registerVehicle(Vehicle v);
    public Vehicle findByPlate(String plate);
    public boolean deleteVehicle(String plate);
    public boolean updateOwner(String plate, String newOwner);
    public List<Vehicle> getAllVehicles();
    public List<Vehicle> filterByType(String type);
    public List<Vehicle> getVehiclesByOwner(String ownerName);
    public List<Vehicle> getExpiredRegistrations(int currentYear);
    public List<Vehicle> getSortedByYear(boolean ascending);
}
