package paint;



public class PaintApp {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		drowPoint(p);
		
		Point p2 = new Point();
		p2.setX(50);
		p2.setY(100);
		drowPoint(p2);

	}
	
	public static void drowPoint(Point point)
	{
		point.show();
	}

}
