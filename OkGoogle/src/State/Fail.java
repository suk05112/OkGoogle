package State;

import OKgoogle.OKgoogle;

public class Fail implements OKgoogleState {
	
	OKgoogle okGoogle;
	
	public Fail(OKgoogle okGoogle) {
		this.okGoogle = okGoogle;
	}

	public void answer() {
		System.out.println("what can i do for you?");
		okGoogle.setState(new Waiting(okGoogle));
		okGoogle.run();
	}
	
	public void run() {
		System.out.println("i didn't understand well");
		okGoogle.setState(new Waiting(okGoogle));
		okGoogle.execute();
		//okGoogle.run();

	}
	
	public String getState_String() {
		return "fail";
	}


}
