package Webinar_01;

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
}
