package Home_work_01;

import Home_work_01.BottleOfWater;
import Home_work_01.Product;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(int volume) {
        for (Product i: products) {
            if (i instanceof BottleOfWater) {
                if (((BottleOfWater) i).getVolume() == volume) {
                    return (BottleOfWater) i;//преобразовываем родительский в наследника.
                }
            }
        }
        return null;
    }

    public Cupcake getCupcake(double colories) {//ищем по колориям
        for(Product j: products) {
            if (j instanceof Cupcake) {
                if(((Cupcake) j).getCalories() == colories) {
                    return (Cupcake)j;
                }
            }
        }
        return null;
    }
}
