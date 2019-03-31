package headfirstdesignpatterns.chapter2;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	Observable observable;

	public StatisticsDisplay(Observable observable){
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			float temperature = weatherData.getTemperature();
			this.numReadings++;
			this.tempSum += temperature;
			
			if (temperature > this.maxTemp) {
				this.maxTemp = temperature;
			}

			if (temperature < minTemp) {
				this.minTemp = temperature;
			}
			
			display();
		}
	}

	

	public void display() {
		String pattern = "Avg/Max/Min temperature = %.2f/%.2f/%.2f";
		String output = String.format(pattern, (this.tempSum / this.numReadings), this.maxTemp, this.minTemp);
		System.out.println(output);
	}
}