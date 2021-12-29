package OKgoogle;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;
import Observer.Subject;
import defaultPackage.BatteryThread;

public class Battery implements Subject{
	
    private List<Observer> observers = new ArrayList<>();
	
	int remainigBattery;
	String batteryState;
	
	BatteryThread bt = new BatteryThread(); //callee
	Thread t = new Thread(bt);
	
	public Battery() {
		remainigBattery = 50;
		batteryCallback();
		//t.start();
	}
	
	public void batteryCallback() {
		bt.setCallBack(new BatteryThread.Callback() {
	        @Override
	        public void batteryState(int remain) {
	        	remainigBattery = remain;
	        	notifyObservers();
//	            System.out.println("스레드에서 온배터리" + remain);
	        }
	    });
	}
	public void batteryThreadStart() {
		t.start();
	}
	
	public void charge() {
		remainigBattery = 100;
		System.out.println("충전 완료" +getreamainigBattery());
	}
	
	public int getreamainigBattery() {
		return remainigBattery;
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
		
	}
	public void notifyObservers() {
        // 모든 옵저버를 순회하며 업데이트를 해준다.
        for (Observer o : observers) {
            o.update(this);
        }
    }

}
