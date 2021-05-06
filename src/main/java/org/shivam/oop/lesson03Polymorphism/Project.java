package main.java.org.shivam.oop.lesson03Polymorphism;

public class Project {
    public static void main(String[] args) {

        /**
         *  INSTANTIATING VEHICLE
         */
        Vehicle myHyundai = new Vehicle(4, 4, "Hyundai", "Elantra", "Black", "2012" );
        for (int seconds = 0; seconds < 10; seconds++) {
            myHyundai.accelerate();
        }
        System.out.println("Current Speed : " + myHyundai.getSpeed());

        myHyundai.turnLeft();
        for (int seconds = 0; seconds < 10; seconds++) {
            myHyundai.accelerate();
        }
        System.out.println("Current Speed : " + myHyundai.getSpeed());

        myHyundai.turnRight();
        for (int seconds = 0; seconds < 15; seconds++) {
            myHyundai.decelerate();
        }
        System.out.println("Current Speed : " + myHyundai.getSpeed());
        System.out.println("========================================================");


        /**
         *  INSTANTIATING TRUCK
         */
        Truck myTata = new Truck(6, 3, "Tata", "Mazda", "Yellow", "2004" );
        for (int seconds = 0; seconds < 10; seconds++) {
            myTata.accelerate();
        }
        System.out.println("Current Speed : " + myTata.getSpeed());

        myTata.turnLeft();
        for (int seconds = 0; seconds < 10; seconds++) {
            myTata.accelerate();
        }
        System.out.println("Current Speed : " + myTata.getSpeed());

        myTata.turnRight();
        for (int seconds = 0; seconds < 15; seconds++) {
            myTata.decelerate();
        }
        System.out.println("Current Speed : " + myHyundai.getSpeed());



    }
}
