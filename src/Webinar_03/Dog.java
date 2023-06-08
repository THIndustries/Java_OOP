package Webinar_03;

public class Dog extends Animal{

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        counter++;
    }

    Dog(String name, int maxSwim, int maxRun) {//передаем параметры конструктору Dog
        super(name, maxSwim, maxRun);//вызываем в теле конструктор родителя с помощью super и передаем наши параметры.
    }
}
