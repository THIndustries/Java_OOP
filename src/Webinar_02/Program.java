package Webinar_02;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsic", "blac");
        ((Animal)cat1).voice();
        ((Animal)cat1).jump();
        System.out.println(cat1.getColor() + " " + cat1.getName());
        Dog dog1 = new Dog("Bobic", 8);
        dog1.voice();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);

        processAnimals(animals);
    }

    //Абстракции и интерфейсы.

    static void  processAnimals(List<Animal> animals) {
        for (Animal i: animals) {
            i.voice();
            i.jump();
            if (i instanceof Cat) {
                System.out.println(((Cat) i).getColor());
            }
        }
    }

}
