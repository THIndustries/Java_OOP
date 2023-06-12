package Webinar_04;

public interface Accountable<T> {

    T getId();

    double getAmount();

    void setAmount(double amount);

}
