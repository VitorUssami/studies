package observer.v1;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("unused")
public class StatisticsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Observable observable;
	
	public StatisticsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("StatisticsDisplay: "+temperature+"F degrees and "+ humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
}	

