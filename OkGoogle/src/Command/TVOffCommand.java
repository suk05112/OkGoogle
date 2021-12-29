package Command;

import Things.TV;

public class TVOffCommand implements Command{

	TV tv;
	
	public TVOffCommand(TV tv){
		this.tv = tv;
	}
	
	public void run() {
		tv.turnOffTV();;
	}
}
