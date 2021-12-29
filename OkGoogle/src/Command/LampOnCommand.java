package Command;

import Iterator.LampIterator;
import Things.Lamp;
import Things.LivingroomLamp;

public class LampOnCommand implements Command{

	LampIterator iterator;
	
	public LampOnCommand(LampIterator iterator) {
		this.iterator = iterator;
	}
	
	public void run() {
		while(iterator.hasNext())
        {
            Lamp lamp = (Lamp)iterator.next();
    		lamp.turnOn();
        }
	}
}
