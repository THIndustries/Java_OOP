package Webinar_07.adapter;

/*
Есть датчики, которые считываю инфу по погоде и эта инфа может записываться в какое-то хранилище.
 */
public class Program {
    public static void main(String[] args) {
        MS200 ms200 = new MS200(01);
        ST5000 st5000 = new ST5000(02);
        MeteoStore meteoStore = new MeteoStore();
        meteoStore.save(ms200);
        meteoStore.save(new AdapterTS5000(st5000));

    }
}
