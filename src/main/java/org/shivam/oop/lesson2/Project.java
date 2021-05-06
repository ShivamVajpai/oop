package main.java.org.shivam.oop.lesson2;

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

    }
}
