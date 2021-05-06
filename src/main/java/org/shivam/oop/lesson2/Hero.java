package main.java.org.shivam.oop.lesson2;

public class Hero implements Action, Abilities {
//public class Hero extends Entity {

    /**
     * PUBLIC PROPERTIES+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    public String name;

    /**
     * PROTECTED PROPERTIES++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    protected int speed;

    /**
     * PRIVATE PROPERTIES++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    private int strength;
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
    public void fights(){
        System.out.println(this.name + " is fighting");
    }

    public void runs() {
        System.out.println(this.name + " is running");
    }

    public void showAbilities() {
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Strength : " + this.strength);
        System.out.println("Speed    : " + this.speed);
        System.out.println("Health   : " + this.health);
    }



}
