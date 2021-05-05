package main.java.org.shivam.oop.lesson1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //TESTING the GettSetterExample
        GetterSetterExample gs1 = new GetterSetterExample(6, 95);
        System.out.println("gs1 Height : " + gs1.getHeight());
        System.out.println("gs1 Weight : " + gs1.getWeight());

        gs1.setHeight(6.2f);
        gs1.setWeight(100);

        System.out.println("gs1 Height : " + gs1.getHeight());
        System.out.println("gs1 Weight : " + gs1.getWeight());

        GetterSetterExample gs2 = new GetterSetterExample();
        gs2.setHeight(5.8f);
        gs2.setWeight(150);

        System.out.println("gs2 Height : " + gs2.getHeight());
        System.out.println("gs2 Weight : " + gs2.getWeight());



    }
}
