package WeatherStation.Interface.Observers;

import WeatherStation.Interface.Display.DisplayElment;
import WeatherStation.Subjects.WeatherStationSubject;

public class CurrentConditionsDisplay implements Observer, DisplayElment {
	private float temperature;
	private float humidity;
	private WeatherStationSubject weatherData;
	
	public CurrentConditionsDisplay(WeatherStationSubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
		
	}
	@Override
	public void display() {
		System.out.println("Current conditions :" + temperature + "F degrees and " + humidity + "% humidity");

	}


}
