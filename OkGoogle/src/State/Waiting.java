package State;

import Command.Command;
import OKgoogle.*;

public class Waiting implements OKgoogleState {
	
	OKgoogle okGoogle;
	
	public Waiting(OKgoogle okGoogle) {
		this.okGoogle = okGoogle;
		//waiting();
	}
	
	public void waiting() {
		okGoogle.execute();
	}
	
	public void answer() {
		
		System.out.println("waiting mode");
		System.out.println("what can i do for you?");
		run();
	}
	
	public void run() {
		okGoogle.setState(new Listening(okGoogle));
		okGoogle.run();
	}
	public String getState_String() {
		return "waiting";
	}

}
