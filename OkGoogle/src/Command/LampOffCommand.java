package Command;

import Iterator.LampGroup;
import Iterator.LampIterator;
import Things.BathroomLamp;
import Things.KitchenLamp;
import Things.Lamp;
import Things.LivingroomLamp;

public class LampOffCommand implements Command{

	LampIterator iterator;
	
	public LampOffCommand(LampIterator iterator) {
		this.iterator = iterator;
	}
	
	public void run() {

        while(iterator.hasNext())
        {
            Lamp lamp = (Lamp)iterator.next();
    		lamp.turnOff();

        }
	}
	

}
