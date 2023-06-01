package Home_work_02;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        if (this.food > food)  {this.food = food;}
    }
    public int getFood(){
        return this.food;
    }

    public void info() {
        if (getFood() >= 0)
            {System.out.println("plate: " + food);}
        else
            {System.out.println("В тарелке недостаточно еды");}
    }

    public void addFood (int moreFood) {
        this.food += moreFood;
    }
}
