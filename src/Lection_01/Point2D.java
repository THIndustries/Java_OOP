package Lection_01;

/**
 * это точка 2д
 * */
public class Point2D {//вделяем сущность точка
    private int x, y; //это поле. Переменная в контексте класса называется полем.

    
    public Point2D(int valueX, int valueY) {
        /*
        Конструктор, у которого нет аргументов, называется конструктором по умолчанию.
        Мы написали свой конструктор. Пользовательский конструктор.
        Конструктор по умолчанию удаляется.
         */
        x = valueX;
        y = valueY;
    }
    //Напишем один метод вместо всех этих повторяющихся
    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int y) {
        this.y = y;
    }
    //    public Point2D(int value) {
//        x = value;
//        y = value;
//    }
//
//    public Point2D(){
//        x = 0;
//        y = 0;
//    }

    /*
    полезные сниперы:
    ctor;
    get; set;
    docs
     */

    /*
У нашего класса Point2D есть какое-то свое поведение,
отвечающее за преобразование этой точки в строку.
Значение по умолчанию определяется методом toString.
     */

    //Напишем метод, который будет показывать току, как нам нужно:
    private  String getInfo() {
        return  String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {//переопределяем метод.
        return getInfo();//теперь метод toString возвращает метод getInfo
    }//теперь при sout(b) - по умолчанию выводит через getInfo
}
