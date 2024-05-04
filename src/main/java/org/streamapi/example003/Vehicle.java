package org.streamapi.example003;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isNew;
    private String color;

    public Vehicle() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0.0;
        this.isNew = false;
        this.color = "";
    }

    public Vehicle(String make, String model, int year, double price, boolean isNew, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isNew = isNew;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isNew=" + isNew +
                ", color='" + color + '\'' +
                '}';
    }
}
