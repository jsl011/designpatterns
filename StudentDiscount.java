package designpatterns.strategy;

public class StudentDiscount implements Discount {
	private final double DISCOUNT = 0.8;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("Ñ§ÉúÆ±£º");
		return price*0.8;
	}

}
