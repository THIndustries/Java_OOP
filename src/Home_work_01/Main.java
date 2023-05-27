package Home_work_01;

import Home_work_01.BotteleOfMilk;
import Home_work_01.BottleOfWater;
import Home_work_01.Product;
import Home_work_01.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    План урока:
- повторить теорию базовых определений ООП – абстракция, инкапсуляция, наследование, полиморфизм
- получить практические навыки в написании сущностей и логики согласно принципам ООП
     */
    public static void main(String[] args) {

        Product product1 = new Product("000 Дюшес","Лимонад",5.50);//создали обьект.
        //Инициализация состояния обьекта:
//        product1.brand = "000 Дюшес";
//        product1.name = "Лимонад";
//        product1.price = 5.50;
        //Пользуемся поведением обьекта:
        var res = product1.displayInfo();
        //System.out.println(res);

        Product bottleOfWater1 = new BottleOfWater("Шишкин лес", "Минеральная вода", 30, 1);
        Product bottleOfWater2 = new BottleOfWater("Пальмовый лес", "Газированная вода", 40, 1);
        Product bottleOfWater3 = new BottleOfWater("Cосновый лес", "Лиморад", 50, 1);


        Product botteleOfMilk1 = new BotteleOfMilk("Naturlih", "Milk", 50,1, 5);
        Product botteleOfMilk2 = new BotteleOfMilk("Natur", "Йогурт", 70,1, 2);
        Product botteleOfMilk3 = new BotteleOfMilk("Farm", "Кефир", 55,1, 3);

        Product cake1 = new Cupcake("ооо рога и копыта", "пироженое сливочное", 35.5, 450.5);
        Product cake2 = new Cupcake("Топ кондитерская", "наполеон", 95.5, 950.9);
        Product cake3 = new Cupcake("ооо Газмяс", "зебра", 25.3, 650.5);

        List<Product> productList = new ArrayList<>();
        productList.add(botteleOfMilk1);
        productList.add(botteleOfMilk2);
        productList.add(botteleOfMilk3);

        productList.add(bottleOfWater1);
        productList.add(bottleOfWater2);
        productList.add(bottleOfWater3);

        productList.add(cake1);
        productList.add(cake2);
        productList.add(cake3);


        VendingMachine vendingMachine = new VendingMachine(productList);
        BottleOfWater result = vendingMachine.getBottleOfWater(1);
        if (result != null) {
            System.out.println("Вы купили: ");
            System.out.println(result.displayInfo());
        } else {
            System.out.println("Такого товара нет.");
        }
        System.out.println("//---------------------------------------------------------");
        Cupcake myCake = vendingMachine.getCupcake(450.5);
        if (myCake != null) {
            System.out.println("Ваша покупка: ");
            System.out.println(myCake.displayInfo());
        } else {
            System.out.println("Товар для вас не найден.");
        }

    }
}
