package assessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assessment.Dial;

public class DialTest {

	Dial testD = new Dial();
	
	
	@Test
	public void testCreateDial() {
		
		assertEquals("Dial not created", testD.getDesc(), "A small watch-like device in your left hand.\r\n" + 
				"It has hands like a watch, but the hands don’t seem to tell\r\n" + 
				"time.");
	}
	
	@Test
	public void testGetDescription() {
		assertEquals("Dial not created", testD.getDesc(), "A small watch-like device in your left hand.\r\n" + 
				"It has hands like a watch, but the hands don’t seem to tell\r\n" + 
				"time.");
	}
	
	@Test
	public void testGetNearest() {
		testD.getNearest();
	}
	
	@Test
	public void testSetDial() {
		testD.setDial();
	}
}
