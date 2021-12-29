package Command;

import Things.Weather;

public class WeatherOnCommand implements Command {
	
	Weather weather;
	
	public WeatherOnCommand(Weather weather) {
		weather = this.weather;
	}
	
	public void run() {
		weather.talkWeather();
	}

}
