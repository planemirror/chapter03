package me.planemirror.paint.main;

import me.planemirror.paint.i.Drawable;
import me.planemirror.paint.point.ColorPoint;
import me.planemirror.paint.point.Point;
import me.planemirror.paint.shape.Circle;
import me.planemirror.paint.shape.Rect;
import me.planemirror.paint.shape.Shape;
import me.planemirror.paint.shape.Triangle;
import me.planemirror.paint.text.GraphicText;

public class PaintApp {

	public static void main(String[] args)
	{
		
		System.out.println("");
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		// drawPoint(p);
		p.draw();
		
		System.out.println("");
		Point p2 = new Point(50, 100);
//		p2.setX(50);
//		p2.setY(100);
		p2.draw();
		
		// 1. 메소드 오버로딩 테스트
		p2.draw();
		p2.draw(true);
		p2.draw(false);
		
		
		// 2. 메소드 오버라이딩 테스트
		System.out.println("");
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		((ColorPoint)p3).setColor("red"); // ColorPoint로 캐스팅함 (Down Casting(명시))
		
		
		p3.draw();
		p3.draw(true);
		p3.draw(false);
		
		
		// 3. 상속관계에서의 생성자 호출 테스트
		System.out.println("");
		Point p4 = new ColorPoint(500, 1000, "yellow");
		p4.draw();
		
		
		// 4. Shape Test, get,set로 좌표 찍는 것은 생략함
		System.out.println("");
		(new Triangle()).draw();
		(new Rect()).draw();
		(new Circle()).draw();
		(new GraphicText("Hello World")).draw();
		
		
//		Shape s = new Shape(); // 오류
//		// abstract가 붙은 추상클래스는 생성할 수 없다.
//		// 문법적으로 구현이 안되게
//		// 넣긴 넣어야되는데 구현할 게 없거나 구현이 안되는 메소드에 이용
		
		// 5. instanceof 연산자 테스트
		// 상속관계에 있는 클래스들만 가능하다 (부모거나 자식)
		System.out.println("");
		Shape s = new Rect();
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		
		System.out.println("");
		Rect r = new Rect();
		System.out.println(r instanceof Object);
		System.out.println(r instanceof Shape);
		System.out.println(r instanceof Rect);
		// System.out.println(r instanceof Triangle);
		
		// 인터페이스의 경우 (구현관계)는 부모자식관계없이 연산이 가능하다.
		System.out.println("");
		System.out.println(r instanceof Drawable);
		// System.out.println(r instanceof List); // ???
		// System.out.println(r instanceof String);  // ???
	}


//	public static void drawPoint(Point point)
//	{
//		point.draw();
//	}
//
//	public static void drawShape(Shape shape)
//	{
//		shape.draw();
//	}

//	public static void drawTriangle(Triangle triangle)
//	{
//		triangle.draw();
//	}
//
//	public static void drawRect(Rect rect)
//	{
//		rect.draw();
//	}
	
	

}
