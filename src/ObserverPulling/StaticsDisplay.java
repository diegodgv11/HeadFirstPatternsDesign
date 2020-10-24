package ObserverPulling;

public class StaticsDisplay implements Observer, DisplayElement {

    private float averageTemperature;
    private float temperaturesSum;
    private int measurementsQuantity;
    private Subject subject;

    public StaticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject notifier) {
        if (notifier instanceof WeatherData) {
            WeatherData weatherData = ((WeatherData) notifier);
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
