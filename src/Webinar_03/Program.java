package Webinar_03;

/**
 *     Создать классы Собака и Кот с наследованием от класса Животное.
 *     Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 *     Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
 *     У каждого животного есть ограничения на действия
 *     (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 *     Добавить подсчет созданных котов, собак и животных.
 */

public class Program {
    public static void main(String[] args) {
         Cat cat1 = new Cat("Barsic", 100);
         cat1.run(50);
         System.out.println(cat1.getId());

        Cat cat2 = new Cat("Apple", 200);
        cat2.run(100);
        System.out.println(cat2.getId());

        Cat cat3 = new Cat("Bobic", 100);
        cat3.run(150);
        System.out.println(cat3.getId());

        Dog dog1 = new Dog("Sharic", 200, 1000);
        Dog dog2 = new Dog("Fonaric", 210,1100);

        System.out.printf("Было созданно %d животных \n", Animal.getCounter());
        System.out.printf("Было созданно %d котов \n", Cat.getCounter());
        System.out.printf("Было созданно %d собак \n", Dog.getCounter());
    }

}
