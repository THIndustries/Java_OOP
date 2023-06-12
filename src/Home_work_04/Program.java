package Home_work_04;

public class Program {
    public static void main(String[] args) {

        Box<Apple> boxApple1 = new Box<>();
        boxApple1.addFruit(new Apple());
        boxApple1.addFruit(new Apple());
        boxApple1.addFruit(new Apple());

        Box<Apple> boxApple2 = new Box<>();
        boxApple2.addFruit(new Apple());
        boxApple2.addFruit(new Apple());

        Box<Orange> boxOrange1 = new Box<>();
        boxOrange1.addFruit(new Orange());
        boxOrange1.addFruit(new Orange());

        Box<Orange> boxOrange2 = new Box<>();
        boxOrange2.addFruit(new Orange());

        System.out.println("Равны ли ящики с яблоками №1 и №2 по весу?: " + boxApple1.compare(boxApple2));
        System.out.println("Равны ли ящики с яблоками №1 по весу с ящиком апельсинов?: " +
                boxApple1.compare(boxOrange1));

        System.out.println("Вес коробки с яблоками №1: " + boxApple1.getWeight());
        System.out.println("Вес коробки с яблоками №2: " + boxApple2.getWeight());
        System.out.println("Вес коробки с аперльсинами №1: " + boxOrange1.getWeight());

        boxApple1.permutation(boxApple2);

        System.out.println("Вес коробки с яблоками №1  после перестановки: " + boxApple1.getWeight());
        System.out.println("Вес коробки с яблоками №2  после перестановки: " + boxApple2.getWeight());

        boxOrange1.permutation(boxOrange2);

        System.out.println("Обновленный вес ящика с апельминами №1: " + boxOrange1.getWeight());
    }
}
