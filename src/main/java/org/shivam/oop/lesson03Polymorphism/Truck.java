package main.java.org.shivam.oop.lesson03Polymorphism;

public class Truck extends Vehicle {

    /**
     * CONSTRUCTORS =========================================================================================
     */
    public Truck(int numWheels, int numDoors, String make, String model, String colour, String year) {
        super(numWheels, numDoors, make, model, colour, year);

        checkNumDoors();
    }

    /**
     * PRIVATE METHODS ======================================================================================
     */
    private void checkNumDoors() {
        if(this.numDoors < 3) {
            this.numDoors = 3;
        }
    }

    /**
     * PUBLIC METHODS =======================================================================================
     */
    @Override
    public void accelerate() {
        this.speed += 2;
        if( this.speed > this.MAX_SPEED) {
            this.speed = this.MAX_SPEED;
        }
    }

    @Override
    public void decelerate() {
        this.speed -= 3;
        if( this.speed <= 0) {
            this.speed = 0;
        }
    }



}
