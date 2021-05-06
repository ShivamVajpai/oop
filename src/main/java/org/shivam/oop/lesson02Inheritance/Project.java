package main.java.org.shivam.oop.lesson02Inheritance;

public class Project {
    public static void main(String[] args) {

        //INSTANTIATE HERO
        Hero h1 = new Hero("Big Man");
        h1.showAbilities();
        h1.fights();
        h1.runs();

        //INSTANTIATE VILLAIN
        Villain v1 = new Villain("Bad Man");
        v1.showAbilities();
        v1.fights();
        v1.runs();
        v1.steals();

        //INTANTIATE VIGILANTE
        Vigilante vg1 = new Vigilante("What Man");
        vg1.showAbilities();
        vg1.fights();
        vg1.runs();
        vg1.steals();
        vg1.assists(h1.name);
        vg1.assists(v1.name);

        //INTANTIATE SPEEDSTER
        Speedster s1 = new Speedster("Speedy Guy");
        s1.showAbilities();
        s1.fights();
        s1.runs();
        s1.boostSpeed();
        System.out.println("Speed of " + s1.name + " is " + s1.getSpeed());

    }
}
