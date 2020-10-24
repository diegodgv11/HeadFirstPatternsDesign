package ObserverPulling;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public WeatherData() {
        temperature = 0;
        humidity = 0;
        pressure = 0;
        observers = new ArrayList<>();
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

}
