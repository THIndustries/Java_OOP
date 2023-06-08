package Home_work_03;

public abstract class Employee implements Comparable<Employee>{
    protected String name;
    protected String surname;
    protected double salary;

    {
        name = "NoName";
        surname = "Unknown";
        salary = 1000;
    }
    public Employee() {

    }

    public Employee (String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }
    /**
     * расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) { //у метода компарету только один параметр, сравниваться он будет с
        //this. т.е. - текущим элементом.
        int temp = name.compareTo(o.name); //используем не статический метод строки
        if (temp == 0) {//если имена обьектов равны, передим к следущему кодовому блоку
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return temp;
    }

    public abstract int getAge();
}
