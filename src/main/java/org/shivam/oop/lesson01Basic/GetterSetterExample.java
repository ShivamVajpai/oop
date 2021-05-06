package main.java.org.shivam.oop.lesson01Basic;

public class GetterSetterExample {

    private float height;
    private float weight;

    public GetterSetterExample() {}

    public GetterSetterExample(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}
