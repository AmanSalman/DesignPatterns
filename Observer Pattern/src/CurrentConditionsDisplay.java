public class CurrentConditionsDisplay implements Observer, display {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject Weatherdata) {
    this.weatherData = Weatherdata;
    Weatherdata.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.humidity = humidity;
    this.temperature = temp;
    this.pressure = pressure;
    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "°F " + humidity + "% " + pressure + " hPa");
  }

}
