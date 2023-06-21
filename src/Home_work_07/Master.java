package Home_work_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Master implements Observer{
    private Random random = new Random();
    private String name;
    private double minSalary; //Минимальная сумма, за которую специались готов работать.

    private List<VacancyType> masterVacancy;
    {
        masterVacancy = new ArrayList<>();
        masterVacancy.add(VacancyType.IT);
        masterVacancy.add(VacancyType.Marketing);
    }

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(60_000, 80_000);
    }

    @Override
    public void receiveOffer(String companyName, double salary, VacancyType vacancyType) {
        if (minSalary <= salary) {
            System.out.printf("Мастер %s (%f) >>> Мне нужна эта работа [%s]! [%s - %f]\n", name, minSalary,
                    vacancyType, companyName, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше (%f)! [%s - %f]\n", name, minSalary,
                    companyName, salary);
        }
    }

    public List<VacancyType> getMasterVacancy() {
        return masterVacancy;
    }
}
