package WeatherStation;

import WeatherStation.Interface.Observers.AllfieldsDisplay;
import WeatherStation.Interface.Observers.CurrentConditionsDisplay;
import WeatherStation.Interface.Observers.TempOnlyDisplay;
import WeatherStation.Subjects.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		final WeatherData weatherData = new WeatherData();
		
		final CurrentConditionsDisplay currentDistplay = new CurrentConditionsDisplay(weatherData);
		final AllfieldsDisplay all = new AllfieldsDisplay(weatherData);
		
		System.out.println("Current Number of observers : " + weatherData.getObserversCount());
		weatherData.setMeasurements(85, 50, 21.4f);
		
		System.out.println("Adding Temp only display");
		final TempOnlyDisplay temp = new TempOnlyDisplay(weatherData);		
		System.out.println("Current Number of observers : " + weatherData.getObserversCount());
		weatherData.setMeasurements(79, 65, 30.4f);
		
		System.out.println("Removing Temp only display");
		weatherData.removeObserver(temp);
		System.out.println("Current Number of observers : " + weatherData.getObserversCount());
		
		
	}

}
