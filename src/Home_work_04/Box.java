package Home_work_04;

import java.util.ArrayList;
import java.util.Comparator;

public class Box<T extends Fruit> {
    /*
    Класс Box, для хранения фруктов.
     */
    private ArrayList<T> fruits = new ArrayList<>(); //Фрукты будут храниться в этой коллекции

    /**
     * Универсальный метод добовления фруктов в коробку с помошью обощения, не привязываясь к типу.
     * @param arg Кол-во фруктов, которые будут добавлены в коробку.
     */
    public void addFruit(T arg) {
        fruits.add(arg);
    }

    /**
     * Универсальный метод для подсчета текущего веса коробки.
     * @return возращаем вес.
     */
    public float getWeight() {
        float tempWeigth = 0;
        for(T i: fruits) {
            tempWeigth += i.weight;
        }
        return tempWeigth;
    }

    /**
     * Метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare().
     * @param box Коробка на вход
     * @return возвращает только  да или нет.
     */

    public String compare(Box<?> box) {
        if (Math.abs(this.getWeight() - box.getWeight()) < 0.0001) { //проверка на равенство весов
            // двух коробок с точностью до 0.0001. Если разница между весами коробок меньше этого значения,
            // то условие вернет true, иначе - false.
            return "Коробки равны по весу";
        }
        return "Коробки НЕ равны по весу";
    }
    /**
     * Универсальный метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * @param arg коробка на вход
     */
    public void permutation(Box<T> arg) {
        if (this == arg) return; //отмена, если текущая коробка равна входящей?

        for (T fruit : fruits) {
            if (arg.fruits.size() > 0 && !fruit.getClass().equals(arg.fruits.get(0).getClass())) {
                throw new RuntimeException("Can't transfer fruits of different types");
            }
            arg.addFruit(fruit);
        }
        fruits.clear();
    }

}
