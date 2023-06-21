package Webinar_07.adapter;

public class ST5000 implements SensorTemperature{
    private int id;

    public ST5000(int id) {
        this.id = id;
    }

    @Override
    public int identifier() {
        return id;
    }

    @Override
    public int tempereture() {
        return -15;
    }
}
