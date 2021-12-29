package Command;

import OKgoogle.OKgoogle;

public class ChargeCommand implements Command {
	
	int remaingBatery;
	OKgoogle okGoogle;
	
	public ChargeCommand(OKgoogle okGoogle) {
		//this.remaingBatery = remaingBatery;
		this.okGoogle = okGoogle;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		okGoogle.charge();
		
	}

}
