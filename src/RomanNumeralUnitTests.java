import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));
	}
	
	@Test
	public void testForNumbersGreaterThan10AndLessThan100()
	{
		assertEquals("X",number.toRoman(10));
		assertEquals("XVI",number.toRoman(16));
		assertEquals("XX",number.toRoman(20));
		assertEquals("XXXII",number.toRoman(32));
		assertEquals("LXXIX",number.toRoman(79));
	}
	
	@Test
	public void testForNumberGreaterThan100()
	{
		assertEquals("C",number.toRoman(100));
		assertEquals("D",number.toRoman(500));
		assertEquals("MMM",number.toRoman(3000));
		assertEquals("MMCMXLIX",number.toRoman(2949));
		assertEquals("MMDXLIX",number.toRoman(2549));
		assertEquals("MMCDXLIX",number.toRoman(2449));
	}
	

}


