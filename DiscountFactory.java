package designpatterns.strategy;

public class DiscountFactory {
	public static Discount getDiscount(String type) {
		Discount discount = null;
		if (type.equalsIgnoreCase("Children")) {
			discount = new ChildrenDiscount();
			System.out.println("��ʼ�����ö�ͯ�ۿۣ�");
		}else if(type.equalsIgnoreCase("Student")) {
			discount = new StudentDiscount();
			System.out.println("��ʼ������ѧ���ۿۣ�");
		}else if(type.equalsIgnoreCase("VIP")) {
			discount = new VIPDiscount();
			System.out.println("��ʼ������VIP�ۿۣ�");
		}
		return discount;
		
	}

}
