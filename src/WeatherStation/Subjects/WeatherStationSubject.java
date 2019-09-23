package WeatherStation.Subjects;

import WeatherStation.Interface.Observers.Observer;

public interface WeatherStationSubject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o );
	public void notifyObservers();
}
