package Observer;

public class StaticsDisplay implements Observer, DisplayElement {

    private float averageTemperature;
    private float temperaturesSum;
    private int measurementsQuantity;
    private Subject weatherData;

    public StaticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        measurementsQuantity++;
        temperaturesSum += temperature;

        this.averageTemperature = temperaturesSum / measurementsQuantity;

        display();
    }

    @Override
    public void display() {
        System.out.println("Statics conditions: " + averageTemperature + "F degrees");
    }

}
