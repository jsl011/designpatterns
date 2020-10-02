package designpatterns.strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		
		mt.setPrice(originalPrice);
		System.out.println("ԭʼ�۸�Ϊ��"+originalPrice);
		System.out.println("----------------------------------");
		
		
		Discount discount;
		discount = (Discount) XMLUtil.getBean();
		mt.setDiscount(discount);
		
		currentPrice = mt.getPrice();
		System.out.println("�ۺ��Ϊ��"+currentPrice);
		*/

		//ͨ����̬�������������ۿ�
		FMovieTicket fmt = new FMovieTicket();
		double originalPrice = 70.0;
		double currentPrice;
		
		fmt.setPrice(originalPrice);
		System.out.println("ԭʼ�۸�Ϊ��"+originalPrice);
		System.out.println("----------------------------------");
		
		Discount discount;
		discount = DiscountFactory.getDiscount("VIP");
		currentPrice = discount.calculate(originalPrice);
		System.out.println("�ۺ��Ϊ��"+currentPrice);
	}

}
