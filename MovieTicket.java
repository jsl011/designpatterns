package designpatterns.strategy;
public class MovieTicket {
	private double price;
	private Discount discount; //维持一个对抽象折扣类的引用

	public void setPrice(double price) {
		this.price = price;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public double getPrice() {
		return discount.calculate(this.price);
	}
}
