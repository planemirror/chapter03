package chapter03;

public class VIPCustomer extends Customer {
	public void set()
	{
		// public은 접근 가능 어디에서든지
		job = "student";
		
		// protected는 접근 가능 자식에서 접근가능
		address = "서울시 은평구 구파발동";
		
		// default는 접근 가능 (같은 패키지 이기 때문에)
		age = 19;
		
		// private는 자식에서 접근 할 수 없다.
		// name = "둘리"
	}
}
