package Home_work_07;

import java.util.Random;

public class Company {
    private Random random = new Random();
    private String companyName;//Название компании
    private double maxSalary;//Максимальная сумма, которую готова компания платить соискателю
    /*
    Ссылка для инициализации агенства внутри компании, это очень важно, так мы связываем две сущности.
     */
    private Publisher jobAgency; //зависимость встроена через интерфейс агенства.
    private VacancyType vacancyType;

    public Company(String companyName, double maxSalary, JobAgency jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType vacancyType) {
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(companyName, salary, vacancyType);
        System.out.println();
    }


}
