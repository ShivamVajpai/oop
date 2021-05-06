package main.java.org.shivam.oop.lesson2;

public class Hero {

    /**
     * PUBLIC PROPERTIES+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    public String name;

    /**
     * PRIVATE PROPERTIES++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    private int strength;
    private int speed;
    private int health;

    /**
     * CONSTRUCTORS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    public Hero(String name) {
        this.name = name;
        generateAbilities();
    }


    /**
     * GETTERS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }


    /**
     * PRIVATE METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    private void generateAbilities() {

    }


    /**
     * PUBLIC METHODS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    public void fight(){

    }

    public void run() {

    }




}
