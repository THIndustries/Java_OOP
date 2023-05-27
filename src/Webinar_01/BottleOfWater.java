package Webinar_01;

public class BottleOfWater extends Product {

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, int volume) {
        super(brand, name, price);
        this.volume = volume;
    }

    @Override//анотация
    public String displayInfo() {//переопределяем свой метод
        //return super.displayInfo();//заглушка. реализзация метода на уровне базового типа
        return String.format("[Бутылка]%s - %s - %f - [обьем: %d]",  brand, name, price, volume);
    }
}
