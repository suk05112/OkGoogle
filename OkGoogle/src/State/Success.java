package State;

import OKgoogle.OKgoogle;

public class Success implements OKgoogleState {
	
	OKgoogle okGoogle;
	
	public Success(OKgoogle okGoogle) {
		this.okGoogle = okGoogle;
	}

	public void answer() {
		System.out.println("what can i do for you now?");
		okGoogle.setState(new Listening(okGoogle));
		okGoogle.run();
	}
	
	public void run() {
		System.out.println("success!!");

		okGoogle.setState(new Waiting(okGoogle));
		okGoogle.execute();
		//okGoogle.call();
		
	}
	
	public String getState_String() {
		return "success";
	}


}
