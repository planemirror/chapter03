package chapter03_2;

import chapter03.Person;

public class Student extends Person {
	
	public void test()
	{
		// public은 외부에서 접근이 가능하다.
		name = "학생";
		
		//protected는 자식에서 접근 가능하다.
		height = 180;
		
		// Default는 같은 패키지에서는 접근가능하다
		// age = 20;
		
	}

}
