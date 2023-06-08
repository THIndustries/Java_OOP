package Home_work_03;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() == o2.getAge()) {
            return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        }
        //return o1.getAge() == o2.getAge() ? 0 : (o1.getAge() > o2.getAge() ? 1 : -1);
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
