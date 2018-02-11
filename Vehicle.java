package eu.rideg;

public class Vehicle {

    //definition of the fields, that are common in vehicles
    private String name;
    private double actualSpeed;
    private double weight;

    // constructor for saving the fields
    public Vehicle(String name, double actualSpeed, double weight) {
        this.name = name;
        this.actualSpeed = actualSpeed;
        this.weight = weight;
    }

    //  Method for changing(increase/decrease) actual speed of vehicle
    public void changeSpeed(double deltaSpeed) {
        System.out.println("changeSpeed method of vehicle was called.");
        System.out.println("Original speed was " + this.actualSpeed);
        this.actualSpeed += deltaSpeed;
        System.out.println("Modified actual speed is " + this.actualSpeed);

    }

    //  Method for braking of vehicle
    public void brake () {
        if (this.actualSpeed ==0) {
            System.out.println("Actual speed is already 0!");
        } else {
            System.out.println("brake method of vehicle was called.");
            this.actualSpeed = 0;
            System.out.println("Actual speed was set to " + this.actualSpeed);
        }

    }

    // Steering is a non-general feature. Trains can't be steered by the engine-drivers.

    // getters
    public String getName() {
        return name;
    }

    public double getActualSpeed() {
        return actualSpeed;
    }

    public double getWeight() {
        return weight;
    }

    // setters - you can set weight, speed and name for Car, inherited from Vehicle
    // these fields are private, so other way you could not set them in main/car object
    public void setName(String name) {
        this.name = name;
    }

    public void setActualSpeed(double actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
