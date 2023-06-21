package Webinar_07.adapter;

public class MS200 implements MeteoSensor{
    private int id;
    MS200(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getTemperature() {
        return 19;
    }

    @Override
    public double getHumidity() {
        return 11;
    }

    @Override
    public double getPressure() {
        return 1;
    }
}
