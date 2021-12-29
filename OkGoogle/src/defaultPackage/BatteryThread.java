package defaultPackage;

import java.util.Scanner;


public class BatteryThread implements Runnable {

	
	public interface Callback{
		public void batteryState(int remain);
	}
	
	private Callback callback;
	String call ="";

	int remaingBatery;
	Scanner sc = new Scanner(System.in);
	
	public BatteryThread() {
		remaingBatery = 70;
	}

	public BatteryThread(int remaingBatery) {
		//this.callback = callback;
		this.remaingBatery = remaingBatery;
	};
	
	public void setCallBack(Callback callback) {
        this.callback = callback;
    }
	
	public void execute() {
		System.out.println("in execute");

        
        if(remaingBatery == 30 || remaingBatery == 0 )
            this.callback.batteryState(remaingBatery);
	}	
	
	public void run() {
		//System.out.println("in run");
		try {
			while(remaingBatery > 0){
				Thread.sleep(1000);
				remaingBatery = remaingBatery - 5;
//				System.out.println("in thread battery" + remaingBatery);
				
				if(this.callback == null)
					System.out.println("callback null");
				
				if(remaingBatery == 30 || remaingBatery == 0 )
		            this.callback.batteryState(remaingBatery);
				
				if(Thread.interrupted()) { 
					break;
				}				
			}
				
		} catch (InterruptedException ie) {
			//ie.printStackTrace();
			// TODO: handle exception
		}
	}
}
