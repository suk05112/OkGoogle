package Command;

import Things.BathroomLamp;

public class BathroomLampOffCommand implements Command{

	BathroomLamp bathroomLamp;
	
	public BathroomLampOffCommand(BathroomLamp bathroomLamp){
		this.bathroomLamp = bathroomLamp;
	}
	
	public void run() {
		bathroomLamp.turnOff();
	}
}
