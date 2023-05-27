package Webinar_01;

public class BotteleOfMilk extends Product{
    private int volume;
    private int fatContent;

    public BotteleOfMilk(String brand, String name, double price, int volume, int fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [обьем: %d] - [жирность: %d]",  brand, name, price, volume, fatContent);
    }
}
