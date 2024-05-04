package org.streamapi.example003;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Ford.ford(vehicle);

        // Create a Ford object with the configured Vehicle
        Ford ford = new Ford(vehicle);

        // Call Ford specific method (assuming it exists)
        Ford.ford(vehicle);
    }
}
