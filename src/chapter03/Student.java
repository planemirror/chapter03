package chapter03;

public class Student extends Person {
	public Student()
	{
		// 자식생성자에서 부모 생성자를 명시적으로 호출 하지 않으면 
		// 컴파일러가 부모의 기본 생성자를 "맨 앞"에 넣어준다.
		// 명시적으로 넣을 때도 "맨 맢"에 넣어야 한다.
		// super();
		
		System.out.println("Student() 호출");
	}
}
