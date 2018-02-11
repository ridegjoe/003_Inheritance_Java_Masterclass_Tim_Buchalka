package eu.rideg;

public class DeLorean extends Car {
    private int actualYear;
    private boolean elevatedDoors;


    // constructor
    public DeLorean(String name, String typeOfEngine, double engineDisplacement, int maxGear, int actualGear, int direction, int actualYear, boolean elevatedDoors) {
        super(name, typeOfEngine, engineDisplacement, maxGear, actualGear, direction);
        this.actualYear = actualYear;
        this.elevatedDoors = elevatedDoors;
    }

    public void timeTravel (int destinationYear) {
        System.out.println("Actual year is " + this.actualYear);
        if (destinationYear == actualYear) {
            System.out.println("Actual year is the same as your destination");
        }   else {
            System.out.println("You are travelling from year " + this.actualYear + " to " + destinationYear);
            actualYear = destinationYear;
            System.out.println("Actual year is updated: " + this.actualYear);
        }
    }

    public void doorElevation (boolean elevateDoors) {
        if (elevatedDoors == elevateDoors ) {
            System.out.println("Doors are already: " + this.elevatedDoors);
        }   else {
            System.out.println("Elevated doors " + this.elevatedDoors + " changed to " + elevateDoors);
            this.elevatedDoors = elevateDoors;
        }
    }

    // getters
    public int getActualYear() {
        return actualYear;
    }

    public boolean isElevatedDoors() {
        return elevatedDoors;
    }
}
