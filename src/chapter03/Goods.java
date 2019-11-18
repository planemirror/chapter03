package chapter03;

public class Goods {
	
	private static int count;
	
	
	private String name;
	public int price;
	private int countStock;
	private int countSold;
	
	public Goods(String name, int price, int countStock, int countSold)
	{
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
		
		Goods.count += 1;
	}
	
//	public Goods() {
//		Goods.count += 1;
//	}
	
	public static void showCount()
	{
		System.out.println(count);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price < 0)
		{
			this.price = 0;
		}
		else
		{
			this.price = price;
		}
	}
	
	// return값이 있고 매개변수(parameter)가 없는 메소드
	public int getCountStock() {
		return countStock;
	}
	
	// return값이 없고 매개변수(parameter)가 있는 메소드
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	// return값과 매개변수 (parameter)가 없는 메소드
	public void showInfo()
	{
		
		System.out.println("상품이름 : " + this.name + "\n" +
		"가격 : " + this.price + "\n" +
		"재고개수 : " + this.countStock + "\n" +
		"팔린개수 : " + this.countSold);
	}
	
	// return값과 매개변수 (parameter)가 있는 메소드
	public int calcDiscountPrice(double discountRate)
	{
		int discountPrice = (int)(price * discountRate);
		
		return discountPrice;
	}
	
}
