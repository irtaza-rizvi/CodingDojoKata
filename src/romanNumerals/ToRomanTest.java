package romanNumerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToRomanTest {

	@Test
	public void test1() {
		assertEquals("I", ToRoman.convert(1));
	}

	@Test
	public void test2() {
		assertEquals("IV", ToRoman.convert(4));
	}

	@Test
	public void test3() {
		assertEquals("VII", ToRoman.convert(7));
	}

	@Test
	public void test4() {
		assertEquals("X", ToRoman.convert(10));
	}

	@Test
	public void test5() {
		assertEquals("II", ToRoman.convert(2));
	}

	@Test
	public void test6() {
		assertEquals("III", ToRoman.convert(3));
	}

	@Test
	public void test7() {
		assertEquals("V", ToRoman.convert(5));
	}

	@Test
	public void test8() {
		assertEquals("VI", ToRoman.convert(6));
	}

	@Test
	public void test9() {
		assertEquals("VIII", ToRoman.convert(8));
	}

	@Test
	public void test10() {
		assertEquals("IX", ToRoman.convert(9));
	}

	@Test
	public void test11() {
		assertEquals("XI", ToRoman.convert(11));
	}

	@Test
	public void test12() {
		assertEquals("XII", ToRoman.convert(12));
	}

	@Test
	public void test13() {
		assertEquals("XIV", ToRoman.convert(14));
	}

	@Test
	public void test14() {
		assertEquals("XV", ToRoman.convert(15));
	}

	@Test
	public void test15() {
		assertEquals("XXIX", ToRoman.convert(29));
	}

	@Test
	public void test16() {
		assertEquals("XIX", ToRoman.convert(19));
	}

	@Test
	public void test17() {
		assertEquals("XXIV", ToRoman.convert(24));
	}

	@Test
	public void test18() {
		assertEquals("XXVII", ToRoman.convert(27));
	}

	@Test
	public void test19() {
		assertEquals("XXXI", ToRoman.convert(31));
	}

	@Test
	public void test20() {
		assertEquals("XXXIX", ToRoman.convert(39));
	}

	@Test
	public void test21() {
		assertEquals("M", ToRoman.convert(1000));
	}

	@Test
	public void test22() {
		assertEquals("CM", ToRoman.convert(900));
	}

	@Test
	public void test23() {
		assertEquals("XC", ToRoman.convert(90));
	}

	@Test
	public void test24() {
		assertEquals("XL", ToRoman.convert(40));
	}

	@Test
	public void test25() {
		assertEquals("L", ToRoman.convert(50));
	}

	@Test
	public void test26() {
		assertEquals("C", ToRoman.convert(100));
	}

	@Test
	public void test27() {
		assertEquals("MCMXC", ToRoman.convert(1990));
	}

	@Test
	public void test28() {
		assertEquals("MM", ToRoman.convert(2000));
	}

	@Test
	public void test29() {
		assertEquals("MMVIII", ToRoman.convert(2008));
	}

	@Test
	public void test30() {
		assertEquals("LX", ToRoman.convert(60));
	}

	@Test
	public void test31() {
		assertEquals("LXX", ToRoman.convert(70));
	}

	@Test
	public void test32() {
		assertEquals("LXXX", ToRoman.convert(80));
	}

	@Test
	public void test33() {
		assertEquals("CCCLXIX", ToRoman.convert(369));
	}

	@Test
	public void test34() {
		assertEquals("CD", ToRoman.convert(400));
	}

	@Test
	public void test35() {
		assertEquals("CDXLVIII", ToRoman.convert(448));
	}

	@Test
	public void test36() {
		assertEquals("MCMXCVIII", ToRoman.convert(1998));
	}

	@Test
	public void test37() {
		assertEquals("MMDCCLI", ToRoman.convert(2751));
	}

	@Test
	public void test38() {
		assertEquals("CMXC", ToRoman.convert(990));
	}

	@Test
	public void test39() {
		assertEquals("MXC", ToRoman.convert(1090));
	}

	@Test
	public void test40() {
		assertEquals("MCCXXXIV", ToRoman.convert(1234));
	}
	
	@Test
	public void test41() {
		assertEquals("MMMCMXCIX", ToRoman.convert(3999));
	}
}
