package Home_work_03;

public class Worker extends Employee{

    protected int age;
    {
        age = 20;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary);
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата " +
                        "(фиксированная месячная оплата): %.2f (руб.); Возраст: %d",
                surname, name, calculateSalary(), age);
    }
}
