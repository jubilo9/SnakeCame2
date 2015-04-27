package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi");
		assertEquals(actual,expected);
	}
	@Test
	public void camelToSnakecaseTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertEquals(actual,expected);
	}
	@Test
	public void capitalizeTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.capitalize("Abc");
		assertEquals(actual,expected);
	}
	@Test
	public void uncapitalizeTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.uncapitalize("abc");
		assertEquals(actual,expected);
	}


}
