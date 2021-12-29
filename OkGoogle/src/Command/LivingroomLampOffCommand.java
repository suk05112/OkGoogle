package Command;

import Things.LivingroomLamp;

public class LivingroomLampOffCommand implements Command {

	LivingroomLamp livingroomLamp;
	
	public LivingroomLampOffCommand(LivingroomLamp livingroomLamp){
		this.livingroomLamp = livingroomLamp;
	}
	
	public void run() {
		livingroomLamp.turnOn();
	}

}
