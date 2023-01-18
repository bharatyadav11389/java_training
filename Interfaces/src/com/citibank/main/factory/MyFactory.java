package com.citibank.main.factory;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.Myinterface;
import com.citibank.main.domain.YourClass;

public class MyFactory {
	
	public static Myinterface getobject(int choice) {
		if(choice ==1) {
			return new MyClass();
		}
		if(choice ==2) {
			return new YourClass();
		}
		return null;
	}

}
