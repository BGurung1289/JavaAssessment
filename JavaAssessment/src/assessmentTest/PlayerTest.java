package assessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import assessment.Player;


public class PlayerTest {

	@Test
	public void testGetName() {
		Player p1 = new Player("Sam", 20);
		
		assertEquals("player name is not same", p1.getName(), "Sam");
	}
	
	@Test
	public void testGetAge() {
		Player p1 = new Player("Sam", 20);
		
		assertEquals("player name is not expected age", p1.getAge(), 20);
	}
	
	@Test
	public void testSetFightingStyle() {
		Player p1 = new Player("Amanda", 23);
		
		p1.setFightingStyle(1);
		assertEquals("fighting style was not set",p1.getStyle().magicStyle(), true);
	}
	
	@Test
	public void testGetStyle() {
		Player p = new Player("Samantha", 100);
		
		p.setFightingStyle(3);
		assertEquals("correct fighting style not gotten",p.getStyle().noStyle(), true);
	}
	
	
}
