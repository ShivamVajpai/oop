package main.java.org.shivam.oop.lesson2;

public class Vigilante extends Villain{

    public Vigilante (String name) {
        super(name);
    }

    public void assists(String name) {
        System.out.println(this.name + " assists " + name);
    }
}
