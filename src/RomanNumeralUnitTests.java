import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI()
	{
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));
		assertEquals("IV", number.toRoman(4));
		assertEquals("VII", number.toRoman(7));
		assertEquals("XL", number.toRoman(40));
		assertEquals("LXI", number.toRoman(61));
		assertEquals("LXX", number.toRoman(70));
		assertEquals("DV", number.toRoman(505));
		//assertEquals("LXX", number.toRoman(70));
	}
	

}
