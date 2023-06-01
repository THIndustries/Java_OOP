package Webinar_02;

abstract class Animal {//создали абстрактный класс
    //итак, мы не можем создать обьект на базе абстрактного класса
    //а что мы можем писать в абстрактном классе?
    //всё тоже самое, что и в обычном

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Animal(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("Животное прыгнуло.");
    }

    public abstract void voice();

}
