package prepTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import prep.Prep;

public class TestPrep {
	
	
	
	@Test
	public void testGetString() {
		Prep p = new Prep("hihi");
		assertEquals("not hihi",p.getString(),"hihi");
	}
	
	
	
}
