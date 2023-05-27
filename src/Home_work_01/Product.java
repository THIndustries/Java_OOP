package Home_work_01;

public class Product {
    protected String name;//состояние моего будущего обьекта на базе класса Product
    protected String brand;
    protected double price;



    Product(){
        this("product", 100.0);//вызвали другой конструктор
        //теперь, вызывая конструктор по умолчанию, мы присваиваем значения вот такой логикой - перейдем в
        //кодовый блок с конструктором с двумя параметрами.
    }

    Product(String inputName, double inputPrice) {
        this("noname", inputName, inputPrice);
    }

    Product(String brand, String name, double price) {
        checkPrice(price);
        this.name = name;
        this.brand = brand;

    }



    private void checkPrice(double inputPrice) {
        if (inputPrice < 0) {
            System.out.println("Значение цены выставленно по умолчанию.");
            price = 1;
        } else {
            price = inputPrice;
        }
    }

    public String displayInfo() {//пример метода, который описывает поведение
        return String.format("%s - %s - %f", brand, name, price);
    }

    double getPrice() {
        return price;
    }
    void setPrice(double inputPrince) {
        checkPrice(inputPrince);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
