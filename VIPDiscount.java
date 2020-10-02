package designpatterns.strategy;

public class VIPDiscount implements Discount {
	private final double DISCOUNT = 0.5;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("VIP票：");
		System.out.println("增加积分：");
		
		return price*DISCOUNT;
	}

}
