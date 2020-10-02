package designpatterns.strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		
		mt.setPrice(originalPrice);
		System.out.println("原始价格为："+originalPrice);
		System.out.println("----------------------------------");
		
		
		Discount discount;
		discount = (Discount) XMLUtil.getBean();
		mt.setDiscount(discount);
		
		currentPrice = mt.getPrice();
		System.out.println("折后价为："+currentPrice);
		*/

		//通过静态工厂方法创建折扣
		FMovieTicket fmt = new FMovieTicket();
		double originalPrice = 70.0;
		double currentPrice;
		
		fmt.setPrice(originalPrice);
		System.out.println("原始价格为："+originalPrice);
		System.out.println("----------------------------------");
		
		Discount discount;
		discount = DiscountFactory.getDiscount("VIP");
		currentPrice = discount.calculate(originalPrice);
		System.out.println("折后价为："+currentPrice);
	}

}
