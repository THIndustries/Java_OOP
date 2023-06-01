package Home_work_02;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Pufic", 5);
        Plate plate = new Plate(100);
        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();

        if (plate.getFood() >= cat.getAppetite()) { //Проеряем, поел ли кот
            cat.setSatiety(true);
        }
        cat.info();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Массив котиков: ");
        //--------------------------------------------------------------
        Cat[] catsArr = {
                new Cat("Hlebushec", 8),
                new Cat("Lutiy", 11),
                new Cat("Moon", 5),
                new Cat("Barsic", 7),
                new Cat("Rishic", 9),
        };

        Plate plateForCats = new Plate(30);
        for (Cat i: catsArr) {
            if(i.getAppetite() > plateForCats.getFood())  {
                i.setSatiety(false);
                System.out.println(i.getName() + "is " + i.isSatiety());
            } else {
                i.setSatiety (true);
                System.out.println(i.getName() + " is " + i.isSatiety());
                plateForCats.setFood(plateForCats.getFood() - i.getAppetite());
            }
            //plateForCats.setFood(plate.getFood() - i.getAppetite());
        }

        //----------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------");
        System.out.println("Добавим еды в тарелку.");
        System.out.println("Было: " + plate.getFood());
        plate.addFood(50);
        System.out.println("Cтало: " + plate.getFood());

    }
}
