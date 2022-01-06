package homwork;

public class Person {

	private String name;
	private int money;
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	public void buyCoffe(BeanCafe cafe) {
		this.money -= 4500;
		cafe.take(4000);
		}
	
	public void buyCoffe(StarCafe cafe) {
		this.money -= 4000;
		cafe.take(4000);
		}
	
	
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.", name, money);
	}
	
	
	
	
}
