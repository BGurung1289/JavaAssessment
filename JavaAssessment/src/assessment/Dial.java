package assessment;

public class Dial {
	
	private int nearest;
	private final String desc = "A small watch-like device in your left hand.\r\n" + 
			"It has hands like a watch, but the hands don’t seem to tell\r\n" + 
			"time."; 
	
	public Dial() {
	}
	
	public void setDial() {
		nearest = 60; 
		//was planning to make input a random number to allow the distance to change once
		//a nearby feature was reached
		
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void getNearest() {
		System.out.println("The nearest magical place is" + nearest + "ft away");
	}
	
	
	
}
