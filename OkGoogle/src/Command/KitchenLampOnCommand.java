package Command;

import Things.KitchenLamp;

public class KitchenLampOnCommand implements Command{


	KitchenLamp kitchenLamp;
	
	public KitchenLampOnCommand(KitchenLamp kitchenLamp){
		this.kitchenLamp = kitchenLamp;
	}
	
	public void run() {
		kitchenLamp.turnOn();
	}
}
