package Home_work_01;

import Home_work_01.Product;

public class BottleOfWater extends Product {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

//    public BottleOfWater(String brand, String name, double price, int volume) {
//        super(brand, name, price);
//        this.volume = volume;
//    }


    public BottleOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;
    }

    @Override//анотация
    public String displayInfo() {//переопределяем свой метод
        //return super.displayInfo();//заглушка. реализзация метода на уровне базового типа
        return String.format("[Бутылка]%s - %s - %f - [обьем: %f]",  brand, name, price, volume);
    }
}
