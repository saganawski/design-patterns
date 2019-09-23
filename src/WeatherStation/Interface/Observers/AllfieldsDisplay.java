package WeatherStation.Interface.Observers;

import WeatherStation.Interface.Display.DisplayElment;
import WeatherStation.Subjects.WeatherStationSubject;

public class AllfieldsDisplay implements Observer, DisplayElment {
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherStationSubject weatherData;
	
	public AllfieldsDisplay(WeatherStationSubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
		
	}
	
	@Override
	public void display() {
		System.out.println("This will display all the raw data from the weather station when updated");
		System.out.println("Temperature : " + temperature + " Humidity : " + humidity + " Pressure : " + pressure);

	}


}
