package paint;



public class PaintApp {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		drowPoint(p);
		
		Point p2 = new Point(50, 100);
//		p2.setX(50);
//		p2.setY(100);
		drowPoint(p2);
		
		// 메소드 오버로딩 테스트
		System.out.println("");
		p2.show();
		p2.show(true);
		p2.show(false);
		
		
		// 메소드 오버라이딩 테스트
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		((ColorPoint)p3).setColor("red"); // ColorPoint로 캐스팅함, 
		
		System.out.println("");
		drowPoint(p3);
		p3.show(true);
		p3.show(false);
		
		


	}
	
	public static void drowPoint(Point point)
	{
		point.show();
	}
	
//	public static void drowColorPoint(ColorPoint colorPoint)
//	{
//		colorPoint.show();
//	}

}
