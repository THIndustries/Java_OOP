package Home_work_03;



import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();
    static Employee genereteEmployee() { //возвращаем родительский тип
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь",
                "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков",
                "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(20, 71);//генератор возраста
        int isWorker = random.nextInt(2);//"стартер" проверки на тип, 1 будет рабочий, 0 фрилансер.
        int salary = random.nextInt(20_000, 80_000);
        switch (isWorker) {
            case 1:
                return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, age);
            case 0:
                return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, age);
            default:
                return null;
        }

    }
    //return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = genereteEmployee();
        }

        Arrays.sort(employees);//сортировка по имени через реализованный в классе Comparable compareTo

        for (Employee j:employees) {
            System.out.println(j);
        }

        //Вызываю свой класс-компоратор для сортировки по возрасту.
        Arrays.sort(employees, new AgeComporator());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Сортировка по возрасту и зарплате: \n");
        for (Employee j:employees) {
            System.out.println(j);
        }

        Arrays.sort(employees, new NameSurNameComporator());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Сортировка по имени и фамилии: \n");
        for (Employee j:employees) {
            System.out.println(j);
        }
    }
}
