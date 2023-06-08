package Home_work_03;

import java.util.Comparator;

public class NameSurNameComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int temp = o1.getName().compareTo(o2.getName());
        if (temp == 0) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
        return temp;
    }
}
