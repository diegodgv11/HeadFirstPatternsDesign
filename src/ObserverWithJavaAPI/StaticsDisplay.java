package ObserverWithJavaAPI;

import java.util.Observer;
import java.util.Observable;

public class StaticsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float averageTemperature;
    private float temperaturesSum;
    private int measurementsQuantity;

    public StaticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            measurementsQuantity++;
            temperaturesSum += weatherData.getTemperature();

            this.averageTemperature = temperaturesSum / measurementsQuantity;

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Statics conditions: " + averageTemperature + "F degrees");
    }

}
