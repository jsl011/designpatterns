package designpatterns.strategy;

public class DiscountFactory {
	public static Discount getDiscount(String type) {
		Discount discount = null;
		if (type.equalsIgnoreCase("Children")) {
			discount = new ChildrenDiscount();
			System.out.println("初始化设置儿童折扣！");
		}else if(type.equalsIgnoreCase("Student")) {
			discount = new StudentDiscount();
			System.out.println("初始化设置学生折扣！");
		}else if(type.equalsIgnoreCase("VIP")) {
			discount = new VIPDiscount();
			System.out.println("初始化设置VIP折扣！");
		}
		return discount;
		
	}

}
