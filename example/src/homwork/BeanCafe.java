package homwork;

public class BeanCafe {



	private String cafeName;
	private int money;
	private int passengerCount;
	
	
	public BeanCafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
	
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("adfasdfasdf");
	}
	
	
}
	
	
	
	