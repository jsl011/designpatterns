package designpatterns.strategy;
public class MovieTicket {
	private double price;
	private Discount discount; //ά��һ���Գ����ۿ��������

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
