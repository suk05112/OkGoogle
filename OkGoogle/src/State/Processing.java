package State;

import Command.Command;
import CommandFactory.CommandFactory;
import OKgoogle.OKgoogle;
import State.*;

public class Processing implements OKgoogleState {

	OKgoogle okGoogle;

	private Command command;
	private String order;
	private CommandFactory cf = new CommandFactory();
	
	public Processing(OKgoogle okGoogle, String order) {
		this.okGoogle = okGoogle;
		this.order = order;
	}
	public void answer() {
		System.out.println("processing order. please wait");
	}
	
	public void run() {
		command = cf.creatCommand(order, okGoogle);
		
		if(command != null) {
			System.out.println("ok. processing");
			command.run();
		
			okGoogle.setState(new Success(okGoogle));
			okGoogle.run();
		}else {
			okGoogle.setState(new Fail(okGoogle));
			okGoogle.run();
		}	
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void talk() {
		command.run();
	}
	
	public String getState_String() {
		return "processing";
	}

}
