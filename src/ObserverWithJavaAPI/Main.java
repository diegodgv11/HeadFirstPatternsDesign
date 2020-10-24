package ObserverWithJavaAPI;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(12.5f, 20.31f, 88.93f);
        weatherData.setMeasurements(16.7f, 25.23f, 89.77f);
        weatherData.setMeasurements(20.1f, 19.91f, 87.24f);

    }

}
