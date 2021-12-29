package CommandFactory;

import Command.*;
import Iterator.LampGroup;
import Iterator.LampIterator;
import OKgoogle.OKgoogle;
import Things.*;

public class CommandFactory {
	
	Command command = null;
	LampIterator iterator;
	
	TV tv = new TV();
	Heater heater = new Heater();
	LivingroomLamp livingroomLamp = new LivingroomLamp();
	KitchenLamp kitchenLamp = new KitchenLamp();
	BathroomLamp bathroomLamp = new BathroomLamp();
	Weather weather = new Weather();
	
	public CommandFactory(){
		lampInit();
	}
	
	public void lampInit() {
		 LampGroup lampGroup = new LampGroup(3);
		 lampGroup.AddLamp(livingroomLamp);
		 lampGroup.AddLamp(kitchenLamp);
		 lampGroup.AddLamp(bathroomLamp);
		 
	     iterator = lampGroup.iterator();
	}
	
	public Command creatCommand(String order, OKgoogle okGoogle) {
		
		switch(order) {
			case("tv켜줘"):
				command = new TVOnCommand(tv);
				break;
			case("tv꺼줘"):
				command = new TVOffCommand(tv);
				break;
			case("불다켜줘"):
				command = new LampOnCommand(iterator);
				if(command == null) System.out.println("command null");
				break;
			case("불다꺼줘"):
				command = new LampOffCommand(iterator);
				break;
			case("거실불켜"):
				command = new LivingroomLampOnCommand(livingroomLamp);
				break;
			case("거실불꺼"):
				command = new LivingroomLampOffCommand(livingroomLamp);
				break;
			case("욕실불"):
				command = new BathroomLampOnCommand(bathroomLamp);
				break;
			case("욕실불꺼"):
				command = new BathroomLampOffCommand(bathroomLamp);
				break;
			case("욕실불켜"):
				command = new KitchenLampOnCommand(kitchenLamp);
				break;
			case("주방불꺼"):
				command = new KitchenLampOffCommand(kitchenLamp);
				break;
			case("충전해줘"):
				command = new ChargeCommand(okGoogle);
			default:
				//System.out.println("factory 생성 불가");
		}
		
		return command;
	}

}
