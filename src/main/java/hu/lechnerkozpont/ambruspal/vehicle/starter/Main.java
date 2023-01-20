package hu.lechnerkozpont.ambruspal.vehicle.starter;

import hu.lechnerkozpont.ambruspal.vehicle.filePersistence.DataAccessStorage;
import hu.lechnerkozpont.ambruspal.vehicle.interactor.DataAccessInterface;
import hu.lechnerkozpont.ambruspal.vehicle.interactor.VehicleInteractor;
import hu.lechnerkozpont.ambruspal.vehicle.ui.Display;

public class Main {
    public static void main(String[] args) {
        System.out.println("System started");

        Display display = new Display();
        VehicleInteractor vehicleInteractor = new VehicleInteractor();
        DataAccessStorage dataAccessStorage = new DataAccessStorage();

        vehicleInteractor.setDataAccessInterface(dataAccessStorage);
        vehicleInteractor.setVehicleDisplayInterface(display);
        vehicleInteractor.findVehicleByRegistrationNumber("333");
    }
}