package assessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assessment.Feature;
import assessment.Game;

public class GameTest {
	Game g = new Game();
	@Test
	public void testCharacter() {
		g.character();
		assertEquals("not created",g.getPlayer().getName(), "B");
	}
	
	@Test
	public void testGetPlayer() {
		assertEquals("no player", g.getPlayer().getName(), "B");
	}
	
	
	@Test
	public void testynChecker() {
		Game g = new Game();
		assertEquals("no match", g.ynchecker("N"), false);
	}
	
	@Test
	public void testBegin() {
		g.begin();
	}
	
	@Test
	public void testAdventure() {
		g.adventure();
	}
	
	@Test
	public void testOptionSelected() {
		g.optionSelected("east");
		assertEquals("not matching", g.optionSelected("Y", "Y"), true);
	}
	
	@Test
	public void testLook() {
		Feature f = new Feature("Tower", "Tower is tall");
		g.look(f);
	}
	
	@Test
	public void testgameState(){
		assertEquals("boolean is not correct", g.gameState(), false);
	}
}
