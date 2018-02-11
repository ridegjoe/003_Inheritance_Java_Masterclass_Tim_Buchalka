package eu.rideg;

public class Car extends Vehicle {

    // definition of car-specific fields
    private String typeOfEngine;            // type of engine
    private double engineDisplacement;      // engine displacement in liter
    private int maxGear;                    // actual gear
    private int actualGear;                 // actual gear
    private int direction;                  // steering angle

    // constructor
    public Car(String name, String typeOfEngine, double engineDisplacement, int maxGear, int actualGear, int direction) {
        super(name, 1, 1);  // every possible vehicle has an actual speed and weight
        this.typeOfEngine = typeOfEngine;
        this.engineDisplacement = engineDisplacement;
        this.maxGear = maxGear;
        this.actualGear = actualGear;
        this.direction = direction;
    }

    //  Method for steering car
    public void steering (int steeringAngle) {
        System.out.println("steering method of car was called.");
        System.out.println("Original direction was " + this.direction);
        if ((-360 <=steeringAngle) && (steeringAngle <= 360)) {
            this.direction += steeringAngle;
            System.out.println("Modified direction is " + this.direction);
        }   else {
            System.out.println("Steering angle of " + steeringAngle + " is out of valid range! (within -360° and +360°)");
        }
    }

    //  Method for change gear
    public void changeGear (int newGear) {
        System.out.println("newGear method of car was called.");
        System.out.println("Original gear was " + this.actualGear);
        if (this.actualGear == newGear) {
            System.out.println("New gear is the already the actual one!");
        }   else {
            if ((newGear > maxGear) || (newGear < 0)) {
                System.out.println("New gear= " + newGear + " is not valid");
                System.out.println("max gear is " + this.maxGear);
            }   else {
                this.actualGear = newGear;
                System.out.println("Gear was set to " + newGear);
            }
        }
    }

    // setters
    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public void setMaxGear(int maxGear) {
        this.maxGear = maxGear;
    }

    public void setActualGear(int actualGear) {
        this.actualGear = actualGear;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
