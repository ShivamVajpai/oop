package main.java.org.shivam.oop.lesson2;

public class Speedster extends Hero {

    public Speedster(String name) {
        super(name);
    }

    public void boostSpeed() {
        this.speed += 50;
        if ( this.speed > 100) {
            this.speed = 100;
        }
    }
}
