package eu.rideg;

public class Main {

    public static void main(String[] args) {
        // TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE START
        //
        // This is a challenge, defined by Tim Buchalka
        // This comment part of the code is a part of his Complete Java Master Course from www.udemy.com:
        //
        // https://www.udemy.com/java-the-complete-java-developer-course/
        //
        // I share the challenge text with his permission.
        //
        // START OF CHALLENGE FOR INHERITANCE
        //
        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.
        //
        // END OF CHALLENGE FOR INHERITANCE
        //
        // The code with the solution is made by myself.

        Car newCar = new Car("A3", "TFSI", 2.0,6,0,0);


        newCar.changeGear(4);
        newCar.changeGear(7);
        newCar.changeGear(-1);
        newCar.changeGear(4);

        newCar.steering(30);
        newCar.steering(15);
        newCar.steering(-370);
        newCar.steering(361);

        newCar.changeSpeed(120);
        newCar.changeSpeed(-50);

        newCar.brake();
        newCar.brake();
        System.out.println("");

        DeLorean DeLoreanDMC12 = new DeLorean("DMC-12","nuclear",10,10,0,0,2015, false);
        DeLoreanDMC12.timeTravel(2015);
        DeLoreanDMC12.timeTravel(2018);

        DeLoreanDMC12.changeSpeed(250);
        DeLoreanDMC12.changeGear(5);
        DeLoreanDMC12.doorElevation(true);
        DeLoreanDMC12.doorElevation(true);
        DeLoreanDMC12.doorElevation(false);
        DeLoreanDMC12.doorElevation(false);
        DeLoreanDMC12.brake();
    }
}
