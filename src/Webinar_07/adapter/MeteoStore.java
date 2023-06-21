package Webinar_07.adapter;

/*
Хранилище информации о погоде.
 */
public class MeteoStore {
    public boolean save(MeteoSensor meteoSensor) {
        System.out.printf("Сохранение данных по метеодатчику\nId: [%d]\nТемпература: [%d]\nВлажность: [%f]" +
                        "\nДавление: [%f],",
                meteoSensor.getId(), meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),meteoSensor.getPressure());
        return true;
    }

    public boolean save(MeteoSensorSimple meteoSensor) {
        System.out.printf("Сохранение данных по метеодатчику\nId: [%d]\nТемпература: [%d]\nВлажность: [%f]" +
                        "\nДавление: [%f],",
                meteoSensor.getId(), meteoSensor.getTemperature());
        return true;
    }
}
