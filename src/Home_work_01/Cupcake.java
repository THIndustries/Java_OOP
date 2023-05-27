package Home_work_01;

public class Cupcake extends Product {

    protected double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Cupcake(String brand, String name, double price, double calories) {
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Производитель: %s] - [Товар: %s] - [Цена: %f] - [калории: %f]",
                brand, name, price, calories);
    }
}
