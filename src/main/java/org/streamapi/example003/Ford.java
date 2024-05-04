package org.streamapi.example003;

public class Ford {
    Vehicle vehicle;

    public Ford(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public static void ford(Vehicle vehicle){
        vehicle.setMake("Ford");
        vehicle.setModel("Mustang");
        vehicle.setYear(1969);
        vehicle.setPrice(30000.00);
        vehicle.setNew(true);
        vehicle.setColor("red");
    }
}
