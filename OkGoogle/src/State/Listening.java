package State;

import java.util.Scanner;

import OKgoogle.OKgoogle;

public class Listening implements OKgoogleState {
	
	Scanner sc = new Scanner(System.in);
	//명령듣는 콜백 만들기	
	OKgoogle okGoogle;
	String order;
	
	public Listening(OKgoogle okGoogle) {
		this.okGoogle = okGoogle;
	}

	public void answer() {
		System.out.println("listening");
		System.out.println("i'm lestening, what can i do for you?");
		run();
	}
	
	public void run() {

		order = sc.next();
		if(order.equals("okGoogle")) answer();
		//okGoogle.execute();
		//callback으로 명령 기다리기, 5초 이상 명령 없으면 다시 litenging 상
		//System.out.println("알겠습니다.");
		okGoogle.setState(new Processing(okGoogle, order)); // 명령전달 
		okGoogle.run();
		
	}
	
	public String getState_String() {
		return "listening";
	}


}
