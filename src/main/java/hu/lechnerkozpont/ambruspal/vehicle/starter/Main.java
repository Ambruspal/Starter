package hu.lechnerkozpont.ambruspal.vehicle.starter;

import hu.lechnerkozpont.ambruspal.vehicle.filePersistence.VehicleDataAccessStorage;
import hu.lechnerkozpont.ambruspal.vehicle.interactor.VehicleInteractor;
import hu.lechnerkozpont.ambruspal.vehicle.interactor.entity.Vehicle;
import hu.lechnerkozpont.ambruspal.vehicle.interactor.interfaces.data.VehicleDataAccessInterface;
import hu.lechnerkozpont.ambruspal.vehicle.ui.Controller;
import hu.lechnerkozpont.ambruspal.vehicle.ui.Presenter;
import hu.lechnerkozpont.ambruspal.vehicle.ui.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("System started");

        VehicleInteractor vehicleInteractor = new VehicleInteractor();
        VehicleDataAccessInterface dataAccessStorage = new VehicleDataAccessStorage();
        Controller controller = new Controller();
        Presenter presenter = new Presenter();
        View view = new View();
        view.setPresenter(presenter);
        view.setController(controller);

        vehicleInteractor.setVehicleDataAccessGateway(dataAccessStorage);
        vehicleInteractor.setVehicleDisplay(presenter);
        controller.setVehicleInteractor(vehicleInteractor);
        presenter.setVehicleInteractor(vehicleInteractor);
        view.run();


//        controller.findVehicleByRegistrationNumber("333");
//
//        Vehicle vehicle = presenter.viewVehicleByRegistrationNumber();
//
//        System.out.println("Vehicle.model :" + vehicle.getModel());





//        Presenter presenter = new Presenter();
//        VehicleInteractor vehicleInteractor = new VehicleInteractor();
//        VehicleDataAccessStorage dataAccessStorage = new VehicleDataAccessStorage();
//
//        vehicleInteractor.setDataAccessInterface(dataAccessStorage);
//        vehicleInteractor.setVehicleDisplayInterface(presenter);
//        vehicleInteractor.findVehicleByRegistrationNumber("333");
    }
}