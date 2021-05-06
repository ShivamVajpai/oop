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
        this.strength = (int)(Math.random()*100 + 1);
        this.speed = (int)(Math.random()*100 + 1);
        this.health = (int)(Math.random()*100 + 1);

    }


    /**
     * PUBLIC METHODS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    public void fight(){
        System.out.println(this.name + " is fighting");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void showAbilities() {
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Strength : " + this.strength);
        System.out.println("Speed    : " + this.speed);
        System.out.println("Health   : " + this.health);
    }



}
