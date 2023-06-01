package Home_work_02;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; //сытость кота да/нет

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat() {
        this("No name", 10);
    }

    public Cat(String name) {
        this(name, 10);
    }
    public Cat(String name, int appetite) {
        this(name, appetite, false);
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return this.appetite;
    }

    public void info() {
        System.out.printf("Котейка: %s, аппетит: %d, сытый: %b\n", name, appetite, satiety);
    }
}
