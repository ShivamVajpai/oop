package main.java.org.shivam.oop.lesson02Inheritance;

public class Villain extends Hero {
    public Villain (String name) {
        super(name);
    }

    public void steals() {
        System.out.println(this.name + " is stealing");
    }
}
