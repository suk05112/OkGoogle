package Command;

import Things.BathroomLamp;

public class BathroomLampOnCommand implements Command {
	BathroomLamp bathroomLamp;
	
	public BathroomLampOnCommand(BathroomLamp bathroomLamp){
		this.bathroomLamp = bathroomLamp;
	}
	
	public void run() {
		bathroomLamp.turnOn();
	}
}
