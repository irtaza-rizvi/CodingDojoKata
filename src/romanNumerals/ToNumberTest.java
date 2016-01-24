package romanNumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToNumberTest {

	@Test
	public void test1() {
		assertEquals(1, ToNumber.convert("I"));
	}

	@Test
	public void test2() {
		assertEquals(4, ToNumber.convert("IV"));
	}

	@Test
	public void test3() {
		assertEquals(7, ToNumber.convert("VII"));
	}

	@Test
	public void test4() {
		assertEquals(10, ToNumber.convert("X"));
	}

	@Test
	public void test5() {
		assertEquals(2, ToNumber.convert("II"));
	}

	@Test
	public void test6() {
		assertEquals(3, ToNumber.convert("III"));
	}

	@Test
	public void test7() {
		assertEquals(5, ToNumber.convert("V"));
	}

	@Test
	public void test8() {
		assertEquals(6, ToNumber.convert("VI"));
	}

	@Test
	public void test9() {
		assertEquals(8, ToNumber.convert("VIII"));
	}

	@Test
	public void test10() {
		assertEquals(9, ToNumber.convert("IX"));
	}

	@Test
	public void test11() {
		assertEquals(11, ToNumber.convert("XI"));
	}

	@Test
	public void test12() {
		assertEquals(12, ToNumber.convert("XII"));
	}

	@Test
	public void test13() {
		assertEquals(14, ToNumber.convert("XIV"));
	}

	@Test
	public void test14() {
		assertEquals(15, ToNumber.convert("XV"));
	}

	@Test
	public void test15() {
		assertEquals(29, ToNumber.convert("XXIX"));
	}

	@Test
	public void test16() {
		assertEquals(19, ToNumber.convert("XIX"));
	}

	@Test
	public void test17() {
		assertEquals(24, ToNumber.convert("XXIV"));
	}

	@Test
	public void test18() {
		assertEquals(27, ToNumber.convert("XXVII"));
	}

	@Test
	public void test19() {
		assertEquals(31, ToNumber.convert("XXXI"));
	}

	@Test
	public void test20() {
		assertEquals(39, ToNumber.convert("XXXIX"));
	}

	@Test
	public void test21() {
		assertEquals(1000, ToNumber.convert("M"));
	}

	@Test
	public void test22() {
		assertEquals(900, ToNumber.convert("CM"));
	}

	@Test
	public void test23() {
		assertEquals(90, ToNumber.convert("XC"));
	}

	@Test
	public void test24() {
		assertEquals(40, ToNumber.convert("XL"));
	}

	@Test
	public void test25() {
		assertEquals(50, ToNumber.convert("L"));
	}

	@Test
	public void test26() {
		assertEquals(100, ToNumber.convert("C"));
	}

	@Test
	public void test27() {
		assertEquals(1990, ToNumber.convert("MCMXC"));
	}

	@Test
	public void test28() {
		assertEquals(2000, ToNumber.convert("MM"));
	}

	@Test
	public void test29() {
		assertEquals(2008, ToNumber.convert("MMVIII"));
	}

	@Test
	public void test30() {
		assertEquals(60, ToNumber.convert("LX"));
	}

	@Test
	public void test31() {
		assertEquals(70, ToNumber.convert("LXX"));
	}

	@Test
	public void test32() {
		assertEquals(80, ToNumber.convert("LXXX"));
	}

	@Test
	public void test33() {
		assertEquals(369, ToNumber.convert("CCCLXIX"));
	}

	@Test
	public void test34() {
		assertEquals(400, ToNumber.convert("CD"));
	}

	@Test
	public void test35() {
		assertEquals(448, ToNumber.convert("CDXLVIII"));
	}

	@Test
	public void test36() {
		assertEquals(1998, ToNumber.convert("MCMXCVIII"));
	}

	@Test
	public void test37() {
		assertEquals(2751, ToNumber.convert("MMDCCLI"));
	}

	@Test
	public void test38() {
		assertEquals(990, ToNumber.convert("CMXC"));
	}

	@Test
	public void test39() {
		assertEquals(1090, ToNumber.convert("MXC"));
	}

	@Test
	public void test40() {
		assertEquals(1234, ToNumber.convert("MCCXXXIV"));
	}
	
	@Test
	public void test41() {
		assertEquals(3999, ToNumber.convert("MMMCMXCIX"));
	}
}
