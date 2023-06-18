package Home_work_06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileWorker {

    private Order order;
    FileWorker() {

    }

    public FileWorker(Order arg) {
        this.order = arg;
    }

    public void saveToJson(Order order) { //метод, которы будет сохранять обьект в файл
        String fileName = "order.json";//создаем поток, связываем его с именем конкретного файла
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write("{\n");
            fw.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            fw.write("\"product\":\"" + order.getProduct() + "\",\n");
            fw.write("\"qnt\":\"" + order.getQnt() + "\",\n");
            fw.write("\"price\":\"" + order.getPrice() + "\",\n");
            fw.write("\n}");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void SaveToLog(Order order) throws Exception {
        String fileName = "orderLog";
        String filePath = "D:\\java_oop\\untitled\\src\\Home_work_06" + fileName;
        Logger log = Logger.getLogger(FileWorker.class.getName());
        FileHandler fh = new FileHandler(filePath, false);
        log.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        log.info("{\n");
        log.info("\"clientName\":\"" + order.getClientName() + "\",\n");
        log.info("\"product\":\"" + order.getProduct() + "\",\n");
        log.info("\"qnt\":\"" + order.getQnt() + "\",\n");
        log.info("\"price\":\"" + order.getPrice() + "\",\n");
        log.info("\n}");
    }
}
