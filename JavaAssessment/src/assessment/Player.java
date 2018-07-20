package assessment;

public class Player {
	private String name;
	private int age;
	private Weapon style;
	
	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	 //not used although tested
	public void setFightingStyle(int a) {
		style.setStyle(a);
	}
	
	public Weapon getStyle() {
		return style;
	}
	
}
