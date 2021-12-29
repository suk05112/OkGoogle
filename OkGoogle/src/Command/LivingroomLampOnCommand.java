package Command;

import Things.LivingroomLamp;

public class LivingroomLampOnCommand implements Command {

	LivingroomLamp livingroomLamp;
	
	public LivingroomLampOnCommand(LivingroomLamp livingroomLamp){
		this.livingroomLamp = livingroomLamp;
	}
	
	public void run() {
		livingroomLamp.turnOff();
	}
}
