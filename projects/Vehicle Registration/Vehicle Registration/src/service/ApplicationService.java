package service;

import model.Vehicle;

public interface ApplicationService {
    public boolean register();
    public Vehicle searchByPlate();
    public void updateOwnerName();
    public void deleteVehicle();
    public void listVehicles();

}
