package ObserverWithJavaAPI;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        temperature = 0;
        humidity = 0;
        pressure = 0;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

}
