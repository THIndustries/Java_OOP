package Home_work_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Professional implements  Observer {
    //Новый тип соискателя
    private Random random = new Random();
    private String name;
    private double minSalary;
    private List<VacancyType> profVacancy;
    {
        profVacancy = new ArrayList<>();
        profVacancy.add(VacancyType.IT);
    }

    public Professional(String name) {
        this.name = name;
        this.minSalary = random.nextDouble(90_000, 120_000);
    }

    @Override
    public void receiveOffer(String companyName, double salary, VacancyType vacancyType) {
        if (minSalary <= salary) {
            System.out.printf("Профессионал %s (%f) >>> Мне нужна эта работа[%s]! [%s - %f]\n", name, minSalary,
                    vacancyType,companyName, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Профессионал %s >>> Я найду работу получше (%f)! [%s - %f]\n", name, minSalary,
                    companyName, salary);
        }
    }

    public List<VacancyType> getProfVacancy() {
        return profVacancy;
    }
}
