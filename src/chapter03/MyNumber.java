package chapter03;

public class MyNumber {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	// 유틸리티성 매소드 클래스 안에 메소드를 넣어놓고 static를 붙이면
	// new로 생성을 하지않고 클래스 이름으로 접근 가능함
	public static int abs(int number) 
	{
		if (number < 0)
		{
			number = number * -1;
			return number;
		}
		return number;
	}
	
	public int abs()
	{
		if (value < 0)
		{
			value = value * -1;
			return value;
		}
		return value;
	}

	public static int max(int i, int j) {
		
		int result = 0;
		
		if (i > j)
		{
			result = i;
		}
		else
		{
			result = j;
		}
		
		//int result = ( i > j) ? i : j ;
		
		return result;
	}

}
