package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		
		// Goods goods = new Goods();
		// private라 외부에서 접근 불가능
		// goods.price = 0;
		
		Goods camera = new Goods();
		
		camera.setName("nikon");
		// camera.setPrice(400000);
		camera.setPrice(-10);
		// camera.price = -10;
		
		camera.setCountStock(30);
		camera.setCountSold(50);

//		System.out.println("상품이름 : " + camera.getName() + "\n" +
//		"가격 : " + camera.getPrice() + "\n" +
//		"재고개수 : " + camera.getCountStock() + "\n" +
//		"팔린개수 : " + camera.getCountSold());	
//		System.out.println();
		
		camera.showInfo();

		Goods camera2 = new Goods();
		Goods camera3 = new Goods();
		Goods camera4 = new Goods();
		
		Goods.showCount();

	}

}
