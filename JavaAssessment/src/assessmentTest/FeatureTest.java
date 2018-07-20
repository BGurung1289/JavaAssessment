package assessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assessment.Feature;

public class FeatureTest {
	
	Feature testFeature = new Feature("Big Ben", "The biggest of Bens");
	
	@Test
	public void testGetName() {
		assertEquals("Name not matching", testFeature.getName(), "Big Ben");
	}
	
	@Test
	public void testGetDesc() {
		assertEquals("Description not matching", testFeature.getDesc(), "The biggest of Bens");
	}
	

}
