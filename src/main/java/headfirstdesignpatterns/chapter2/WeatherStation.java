package headfirstdesignpatterns.chapter2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		
		double randomNrOfUpdates = ThreadLocalRandom.current().nextInt(5, 25 + 1);
		Random r = new Random();
		for(int i = 1; i < randomNrOfUpdates; i++) {
			float randomTemp = 70 + r.nextFloat() * (90 - 70);
			float randomHumidity = 60 + r.nextFloat() * (95 - 60);
			float randomPressure = 28 + r.nextFloat() * (31 - 28);
			
			System.out.println("------------ " + i + " ------------");
			
			weatherData.setMeasurements(randomTemp, randomHumidity, randomPressure);
		}
		
	}
}
