package Home_work_01;

import Home_work_01.Product;

public class BotteleOfMilk extends Product {
    private double volume;
    private double fatContent;

    public BotteleOfMilk(String brand, String name, double price, double volume, double fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [обьем: %f] - [жирность: %f]",  brand, name, price, volume, fatContent);
    }
}
