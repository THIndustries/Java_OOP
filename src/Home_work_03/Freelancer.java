package Home_work_03;

public class Freelancer extends Employee{

    protected int age;
    protected int hours;

    public int getAge() {
        return age;
    }

    {
        age = 20;
        hours = 1;
    }
    @Override
    public double calculateSalary() {
        return salary;
    }

    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    public Freelancer(String name, String surname, int salary, int hours) {
        super(name, surname, salary);
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата " +
                        "(фиксированная месячная оплата): %.2f (руб.); Возраст: %d",
                surname, name, calculateSalary(), age);
    }
}
