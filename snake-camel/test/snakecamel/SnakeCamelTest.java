package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	
	@Test
	public void snakeToCamelcaseTest() {
		SnakeCamelUtil suc = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = suc.snakeToCamelcase("abc_def_ghi");
		assertEquals(actual,expected);
	}
	@Test
	public void camelToSnakecaseTest() {
		SnakeCamelUtil suc = new SnakeCamelUtil();
		String expected = "abc_d";
		String actual = suc.camelToSnakecase("AbcD");
		assertEquals(actual,expected);
	}
	@Test
	public void capitalizeTest() {
		SnakeCamelUtil suc = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = suc.capitalize("abc");
		assertEquals(actual,expected);
	}
	@Test
	public void uncapitalizeTest() {
		SnakeCamelUtil suc = new SnakeCamelUtil();
		String expected = "abc";
		String actual = suc.uncapitalize("Abc");
		assertEquals(actual,expected);
	}
}
