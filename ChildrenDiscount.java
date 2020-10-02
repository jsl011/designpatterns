package designpatterns.strategy;

public class ChildrenDiscount implements Discount {
	private final double DISCOUNT = 10;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("¶ùÍ¯Æ±£º");
		if(price>20) {
			return price-DISCOUNT;
		}else {
			return price;
		}
	}
}
