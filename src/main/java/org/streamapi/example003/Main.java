package org.streamapi.example003;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Ford ford = new Ford(vehicle);
        ford.getVehicle().setMake("Ford");
        ford.getVehicle().setModel("Mustang");
        ford.getVehicle().setYear(1969);
        ford.getVehicle().setPrice(30000.00);
        ford.getVehicle().setNew(true);
        ford.getVehicle().setColor("red");

        System.out.println(ford.getVehicle().toString());
    }
}
