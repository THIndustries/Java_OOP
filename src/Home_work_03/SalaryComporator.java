package Home_work_03;

import java.util.Comparator;
/*
Класс-компоратор для сортировки по зарабатной плате]
 */

public class SalaryComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.calculateSalary() == o2.calculateSalary() ?
        // 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
