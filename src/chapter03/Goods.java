package chapter03;

public class Goods {
	
	private static int count;
	
	
	private String name;
	public int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		Goods.count += 1;
	}
	
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
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo()
	{
		System.out.println("상품이름 : " + this.name + "\n" +
		"가격 : " + this.price + "\n" +
		"재고개수 : " + this.countStock + "\n" +
		"팔린개수 : " + this.countSold);
	}
	
	
	
}
