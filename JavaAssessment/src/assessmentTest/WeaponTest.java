package assessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import assessment.Weapon;


public class WeaponTest {

	@Test
	public void testSetStyle() {
		Weapon w = new Weapon();
		w.setStyle(2);
		assertEquals("not set properly", w.swordStyle(), true);
	}
}
