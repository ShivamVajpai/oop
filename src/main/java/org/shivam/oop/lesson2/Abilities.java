package main.java.org.shivam.oop.lesson2;

public interface Abilities {

    int strength = 0;
    int speed = 0;
    int health = 0;
}

// As interfaces, if the members do not have default values while creating them,
// then it will throw issue that they are not instantiated.
// for this reason we can use ABSTRACT CLASS (check out file Entity)
// The the hero class will change from
    // public interface Action
    // public interface Abilities
    // public class Hero implements Action, Abilities
// To
    // public interface Action
    // public abstract class Entity implements Action
    // public class Hero extends Entity

