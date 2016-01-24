package harryPotterBooks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceTest {

	@Test
	public void test1() {
		Price p = new Price();
		int[] basket = { 0, 0, 1, 1, 2, 2, 3, 4 };
		assertEquals(51.2, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test2() {
		Price p = new Price();
		int[] basket = {};
		assertEquals(0, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test3() {
		Price p = new Price();
		int[] basket = {0};
		assertEquals(8, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test4() {
		Price p = new Price();
		int[] basket = {1};
		assertEquals(8, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test5() {
		Price p = new Price();
		int[] basket = {2};
		assertEquals(8, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test6() {
		Price p = new Price();
		int[] basket = {3};
		assertEquals(8, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test7() {
		Price p = new Price();
		int[] basket = {4};
		assertEquals(8, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test8() {
		Price p = new Price();
		int[] basket = {0, 0};
		assertEquals(8 * 2, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test9() {
		Price p = new Price();
		int[] basket = {1, 1, 1};
		assertEquals(8 * 3, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test10() {
		Price p = new Price();
		int[] basket = {0, 1};
		assertEquals(8 * 2 * 0.95, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test11() {
		Price p = new Price();
		int[] basket = {0, 2, 4};
		assertEquals(8 * 3 * 0.9, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test12() {
		Price p = new Price();
		int[] basket = {0, 1, 2, 4};
		assertEquals(8 * 4 * 0.8, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test13() {
		Price p = new Price();
		int[] basket = {0, 1, 2, 3, 4};
		assertEquals(8 * 5 * 0.75, p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test14() {
		Price p = new Price();
		int[] basket = {0, 0, 1};
		assertEquals(8 + (8 * 2 * 0.95), p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test15() {
		Price p = new Price();
		int[] basket = {0, 0, 1, 1};
		assertEquals(2 * (8 * 2 * 0.95), p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test16() {
		Price p = new Price();
		int[] basket = {0, 0, 1, 2, 2, 3};
		assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95), p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test17() {
		Price p = new Price();
		int[] basket = {0, 1, 1, 2, 3, 4};
		assertEquals(8 + (8 * 5 * 0.75), p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test18() {
		Price p = new Price();
		int[] basket = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4};
		assertEquals(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8), p.calculatePrice(basket), 0);
	}
	
	@Test
	public void test19() {
		Price p = new Price();
		int[] basket = {0, 0, 1, 1, 2, 2, 3, 4};
		assertEquals(2 * (8 * 4 * 0.8), p.calculatePrice(basket), 0);
	}
}
