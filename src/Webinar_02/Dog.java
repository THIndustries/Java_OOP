package Webinar_02;

public class Dog extends Animal {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Собака гавкает.");
    }
}
