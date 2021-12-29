package OKgoogle;

import java.util.Scanner;

import Command.Command;
import Iterator.LampGroup;
import Observer.Observer;
import State.*;
import defaultPackage.BatteryThread;
import Things.*;
import Iterator.*;


public class OKgoogle implements Observer{

	Scanner sc = new Scanner(System.in);
	
	private OKgoogleState state;
	private String call;
	Battery battery = new Battery();
	boolean flag = true;

	public OKgoogle() {
		this.state = new Waiting(this);
		battery.attach(this);

	}	
	
	public int execute() {

		if(battery.t.getState() == Thread.State.NEW) {
			battery.batteryThreadStart();

			String inputOn ="";

		}
		while(true) {
			if(battery.getreamainigBattery() == 0) {
				break;
			}

			call = sc.next();

			if(call.equals("okGoogle"))
				call();
        	else if(getState().equals("listening"))
        		run();		
			}
		return 0;
		
	}
	
	public String getState() {
		return state.getState_String();
	}
	public void setState(OKgoogleState state) {
		this.state = state;
	}
	
	public void run() {
		state.run();
	}
	public void call() {
		state.answer();
	}
	
	public void charge() {
		threadStop();
		battery.charge();
		threadStart();
	}
	
	public void threadStop() {
		battery.t.interrupt();
	}
	public void threadStart() {	
		battery.bt = new BatteryThread(battery.getreamainigBattery());
		battery.t = new Thread(battery.bt);
		battery.batteryCallback();
		battery.t.start();
	}

	@Override
	public void update(Battery battery) {
		// TODO Auto-generated method stub
		//battery = battery
		System.out.println("battery level" + battery.getreamainigBattery());


			
	}
}
