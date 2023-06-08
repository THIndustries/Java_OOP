package Webinar_03;

public abstract class Animal {

    private int id;

    protected String name;
    private int maxSwim;
    public int maxRun;
    private static int counter;//это статическое поле будет хранить кол-во созданных экземпляров на его остнове.

    private static int identifier; //статическое поле

    public static int getIdentifier() {
        /*
        Обрати внимение, что метод, который возвращает значение приватного статичного поля - тоже
        статичный, потому что обратное - не логично, зачем делать метод, возвращающий статичное значение
        не статичным?
         */
        return identifier;
    }
    //статический инициализатор:
    static {
        System.out.println("Статический инициализатор");
        identifier = 2000;
    }

    /*
Инициализатор: если добавить скобки {} в контексте класса, это называется инициализатор.
они созданы чтобы я мог проинициализировать свои поля в контескте своего класса и тд.
важно понимать, что инициализатор будет отрабатывать каждый раз перед отработкой конструктора.
 */
    {
        System.out.println("Инициализатор");
        /*
        проинициализируем наши поля по умолчанию в нашем инициализаторе:
         */
        name = "Животное";
        maxRun = 10;
        maxSwim = 10;
        this.id = ++identifier;
        counter++;
    }

    public Animal(String name, int maxSwim, int maxRun) {
        System.out.println("Конструктор");

        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }
    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxRun() {
        return maxRun;
    }

    void run (int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distance);
        }
    }

    void swim (int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distance);
        }
    }

}
