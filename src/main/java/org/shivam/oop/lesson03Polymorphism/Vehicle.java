package main.java.org.shivam.oop.lesson03Polymorphism;

public class Vehicle {

    /**
     *  DATA MEMBERS ==========================================================
     */
    protected int numWheels = 4;
    protected int numDoors = 2;
    protected String make;
    protected String model;
    protected String colour;
    protected String year;
    protected double speed;
    protected final double MAX_SPEED = 100;

    /**
     * GETTERS =================================================================
     */
    public int getNumWheels() {
        return this.numWheels;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public String getYear() {
        return this.year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public double getSpeed() {
        return this.speed;
    }

    /**
     * CONSTRUCTORS =========================================================================================
     */
    public Vehicle(int numWheels, int numDoors, String make, String model, String colour, String year) {
        this.numWheels = numWheels;
        this.numDoors = numDoors;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;

    }

    public Vehicle(String make, String model, String colour, String year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;

    }

    /**
     * PUBLIC METHODS ============================================================
     */

    public void accelerate() {
        this.speed += 4;
        if( this.speed > this.MAX_SPEED) {
            this.speed = this.MAX_SPEED;
        }
    }

    public void decelerate() {
        this.speed -= 6;
        if( this.speed <= 0) {
            this.speed = 0;
        }
    }

    public void turnLeft() {
        System.out.println("Vehicle turned left");
    }

    public void turnRight() {
        System.out.println("Vehicle turned right");
    }

}
