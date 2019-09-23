package WeatherStation.Interface.Observers;

import WeatherStation.Interface.Display.DisplayElment;
import WeatherStation.Subjects.WeatherStationSubject;

public class TempOnlyDisplay implements Observer, DisplayElment {
	private float temperature;
	private WeatherStationSubject weatherData;
	
	public TempOnlyDisplay(WeatherStationSubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("I only care about the temp. Temp : " + temperature);

	}


}
