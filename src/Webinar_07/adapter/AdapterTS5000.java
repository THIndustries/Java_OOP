package Webinar_07.adapter;

public class AdapterTS5000 implements MeteoSensorSimple{

    private final SensorTemperature sensorTemperature;

    public AdapterTS5000(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public int getTemperature() {
        return sensorTemperature.tempereture();
    }

    /*
    @Override
    public double getHumidity() {
        return 0;
    }

    @Override
    public double getPressure() {
        return 0;
    }

     */
}
