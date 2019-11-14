package chapter03;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		// public은 외부에서 접근 가능하다
		p.name = "사람";
		
		// protected는 같은 패키지에서는 접근 가능하다.
		p.height = 170;
		
		// Default는 같은 패키지에서는 접근 가능하다.
		p.age = 10;

		// Private는 내부에서만 접근 가능하다.
		// p.weight; = 100;
	}

}
