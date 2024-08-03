import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
  private float temperature;
  private float humidity;
  private float pressure;
  private ArrayList<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<Observer>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void measurementsChanged(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    System.out.printf("Weather data changed: %f, %f, %f%n", temperature, humidity, pressure);
    notifyObservers();
  }

}
