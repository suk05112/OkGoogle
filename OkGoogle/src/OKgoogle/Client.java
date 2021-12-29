package OKgoogle;

import java.util.Scanner;

import Command.*;
import Observer.Observer;
import Observer.Subject;
import Things.*;
import State.*;

public class Client{

	public static void main(String[] args) {
		
        OKgoogle okGoogle = new OKgoogle(); 
        Scanner sc = new Scanner(System.in);
		//okGoogle.execute();

        System.out.println("input on if you want to start");
        String input="";
        while(true) {
    		if(okGoogle.battery.remainigBattery == 0) {
    			System.out.println("The device turns off because there is no battery.");
    	        input = sc.next();
    		}
    			
    	   if(okGoogle.execute()==0 && input.equals("on")) {
    		   okGoogle.charge();
    	   }
    
       }
	


	}
}
