package service;

import model.Vehicle;

public interface ApplicationService {
    boolean register();
    Vehicle searchByPlate();
    void updateOwnerName();
    void deleteVehicle();
    void listVehicles();
    void filterByType();
    void ownerHistory();
    void expiredRegistrations();
    void printStatistics();
    void loadVehicles();


}
