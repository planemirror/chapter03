package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		
		// Goods goods = new Goods();
		// private라 외부에서 접근 불가능
		// goods.price = 0;
		
		// 객체를 생성하는 데 필요한 클래스 정보를 얻어온다 (클래스이름, 메소드정보, 필드정보) : reflection
		// Class cls = camera.getClass();
		// System.out.println(cls.getName());
		
		Goods camera = new Goods("nikon", 400000, 30, 50);
		
		
		//camera.setName("nikon");
		// camera.setPrice(400000);
		//camera.setPrice(1000);
		// camera.price = -10;
		
		//camera.setCountStock(30);
		//camera.setCountSold(50);
		
		int price = camera.getPrice();
		System.out.println(price);
		System.out.println("");

//		System.out.println("상품이름 : " + camera.getName() + "\n" +
//		"가격 : " + camera.getPrice() + "\n" +
//		"재고개수 : " + camera.getCountStock() + "\n" +
//		"팔린개수 : " + camera.getCountSold());	
//		System.out.println();
		
		camera.showInfo();
		System.out.println("");
		
		int discountPrice = camera.calcDiscountPrice(0.5); // 리터럴로 쓰면 double로 인식
		System.out.println(discountPrice);
		System.out.println("");
		
		Goods camera2 = new Goods();
		//Goods camera3 = new Goods();
		//Goods camera4 = new Goods();
		
		Goods.showCount();
		System.out.println("");

	}

}
