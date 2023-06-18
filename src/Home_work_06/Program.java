package Home_work_06;

import java.io.FileWriter;

public class Program {
    /**
     * Задача 1. Оптимизировать работу класса order в рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Order order = new Order();
        FileWorker fileWorker = new FileWorker();

        /**
         * Перенес медот saveToJson в отдельный класс и добавил логер
         */
        //order.inputFromConsole();
        //fileWorker.saveToJson(order);
        order.inputFromConsole();
        fileWorker.SaveToLog(order);
    }
}
