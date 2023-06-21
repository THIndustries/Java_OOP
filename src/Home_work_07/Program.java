package Home_work_07;

import java.util.Random;

/**
 * 1. Доработать приложеие. Поработать с шаблоном проектирования обсервер, добавить новый тип соискателя.
 * 2. Добавить новую сущность Вакансия. Компания должна рассылать вакансии.
 * 3. Предусмотреь тип вакансии. Описать этот тип в рамках перечисления enum.
 */


public class Program {
    static Random random = new Random();
    static String genereteEmployee() {
        String[] surname = new String[] {"Иванов", "Петров", "Сидоров","Григорьев", "Фокин", "Шестаков",
                "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        return surname[random.nextInt(surname.length)];
    }

    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 80_000, jobAgency);
        Company google = new Company("Google", 120_000, jobAgency);
        Company yandex = new Company("Yandex", 140_000, jobAgency);
        Company nasa = new Company("Nasa", 200_000, jobAgency);

        Master master1 = new Master(genereteEmployee());
        Master master2 = new Master(genereteEmployee());
        Student student1 = new Student(genereteEmployee());
        Student student3 = new Student(genereteEmployee());
        Student student4 = new Student(genereteEmployee());
        Professional prof1 = new Professional(genereteEmployee());

        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(student3);
        jobAgency.registerObserver(student4);
        jobAgency.registerObserver(prof1);

        for (int i = 0; i < 5; i++) {
            geekBrains.needEmployee(VacancyType.Cleaner);
            google.needEmployee(VacancyType.Sales);
            yandex.needEmployee(VacancyType.Marketing);
            nasa.needEmployee(VacancyType.IT);
        }

    }
}
