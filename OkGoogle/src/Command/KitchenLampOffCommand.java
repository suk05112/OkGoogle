package Command;

import Things.KitchenLamp;

public class KitchenLampOffCommand implements Command {

	KitchenLamp kitchenLamp;
	
	public KitchenLampOffCommand(KitchenLamp kitchenLamp){
		this.kitchenLamp = kitchenLamp;
	}
	
	public void run() {
		kitchenLamp.turnOff();
	}

}
