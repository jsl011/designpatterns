package designpatterns.strategy;

public class FMovieTicket {
	private double price;
	private Discount discount;
	private String getdiscount;
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void getDiscount(String getdiscount) {
		DiscountFactory discountFactory = new DiscountFactory();
		this.discount = discountFactory.getDiscount(getdiscount);
	}
	
	public double getPrice() {
		return discount.calculate(this.price);
	}

}
