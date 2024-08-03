public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.measurementsChanged(25.0f, 65.0f, 1013.1f);
    weatherData.measurementsChanged(27.0f, 70.0f, 1012.5f);
    weatherData.measurementsChanged(23.0f, 68.0f, 1011.3f);

  }

}
