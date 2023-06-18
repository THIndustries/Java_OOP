package Home_work_06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    public Order() {

    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void inputFromConsole() {
        clientName = promt("Имя клиента: ");
        product = promt("Продукт: ");
        qnt = Integer.parseInt(promt("Кол-во: "));
        price = Integer.parseInt(promt("Цена: "));

    }

    private String promt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }


}
