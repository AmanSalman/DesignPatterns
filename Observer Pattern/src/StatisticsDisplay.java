public class StatisticsDisplay implements display, Observer {
  private float maxTemperature = Float.MIN_VALUE;
  private float minTemperature = Float.MAX_VALUE;
  private float sumTemperature = 0.0f;
  private int numReadings = 0;
  private Subject weatherData;

  public StatisticsDisplay(Subject WD) {
    this.weatherData = WD;
    WD.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    sumTemperature += temperature;
    numReadings++;

    if (temperature > maxTemperature) {
      maxTemperature = temperature;
    }

    if (temperature < minTemperature) {
      minTemperature = temperature;
    }

    display();
  }

  public void display() {
    float avgTemperature = sumTemperature / numReadings;
    System.out.println("Avg/Max/Min temperature = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
  }
}
