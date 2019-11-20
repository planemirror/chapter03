package me.planemirror.paint.point;

import me.planemirror.paint.i.Drawable;

public class Point implements Drawable {
	
	private int x;
	private int y;
	
	public Point()
	{
		System.out.println("Point() 호출");
	}
	
	public Point(int x, int y)
	{
		this.x = x; // stack에 있는 x 변수에 접근하기 위해 this키워드를 사용함
		this.y = y; // stack에 있는 y 변수에 접근하기 위해 this키워드를 사용함
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw()
	{
		System.out.println("점 [" + x + "," + y +"]을 그렸습니다.");
	}
	
	public void draw(boolean visible)
	{
		if(visible)
		{
			draw();
		}
		else
		{
			System.out.println("점 [" + x + "," + y +"]을 지웟습니다.");
		}
	}
	
	
}
