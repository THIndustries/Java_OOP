package Lection_04;

public class Result extends Nums{

    Result(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public int sumOfNum() {
        return getNum1() + getNum2();
    }

    @Override
    public String toString() {
        return String.format("%d + %d = %d", getNum1(), getNum2(), sumOfNum());
    }
}
