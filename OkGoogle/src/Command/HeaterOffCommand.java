package Command;

import Things.Heater;

public class HeaterOffCommand implements Command{

	Heater heater;
	
	public HeaterOffCommand(Heater heater){
		this.heater = heater;
	}
	
	public void run() {
		heater.powerOffHeater();
	}

}
