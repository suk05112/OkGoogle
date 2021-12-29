package Command;

import Things.Heater;

public class HeaterOnCommand implements Command {

	Heater heater;
	
	public HeaterOnCommand(Heater heater){
		this.heater = heater;
	}
	
	public void run() {
		heater.powerOnHeater();
	}
}
