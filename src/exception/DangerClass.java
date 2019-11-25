package exception;

import java.io.IOException;

public class DangerClass {
	
	public void danger() throws IOException, MyException
	{
		System.out.println("some code1");
		System.out.println("some code2");
		
		if (1==1)
		{
			throw new MyException();
		}
		throw new IOException();
	}

}
