package Lection_01;

public class PointMethod {
    //Самый первый пример с точками в 2д пространстве.
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
    }

    //static double distance(Point2D a, Point2D b) {
        //return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    //}

    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);//обьявляем экземпляр класса Point2D
        //a.x = 0;//указываем значения нужных нам полей
        //a.y = 2;
        a.setX(12);
        System.out.println(a.getX());
        Point2D b = new Point2D(10);//Второй экземпляр класса. b размещается в стеке, все остальное в куче
//        b.x = 10
//        b.y = 10;
        Point2D c = new Point2D();
        System.out.println(b);
        System.out.println();
        //System.out.println(distance(a,b));
//        int ax = 0;
//        int ay = 0;
//        int bx = 0;
//        int by = 0;
//        System.out.println(distance(ax,ay,bx,by));
        //cоздать точку
        //печатать точку
    }
    //в целом это стихийный подход с добалвением процедурного
}
