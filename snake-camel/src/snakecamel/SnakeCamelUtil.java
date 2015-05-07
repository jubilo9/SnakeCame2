package snakecamel;

import static org.junit.Assert.assertEquals;

public class SnakeCamelUtil {

	 public static void main(String[] args){
		 capitalizeTest1();
		 capitalizeTest2();
		 capitalizeTest3();
		 uncapitalizeTest1();
		 uncapitalizeTest2();
		 uncapitalizeTest3();
		 camelToSnakecaseTest1();
		 camelToSnakecaseTest2();
		 camelToSnakecaseTest3();
		 snakeToCamelcaseTest1();
		 snakeToCamelcaseTest2();
		 snakeToCamelcaseTest3();
		 snakeToCamelcaseTest4();
		 snakeToCamelcaseTest5();
	 }
	 public static void capitalizeTest1(){
			String expected = "";
			String actual = capitalize("");
			assertEquals(actual,expected);
	 }
	 public static void capitalizeTest2(){
			String expected = "A";
			String actual = capitalize("a");
			assertEquals(actual,expected);
	 }
	 public static void capitalizeTest3(){
			String expected = "Xyz";
			String actual = capitalize("xyz");
			assertEquals(actual,expected);
	 }
	 public static void uncapitalizeTest1(){
			String expected = "";
			String actual = uncapitalize("");
			assertEquals(actual,expected);
	 }
	 public static void uncapitalizeTest2(){
			String expected = "a";
			String actual = uncapitalize("A");
			assertEquals(actual,expected);
	 }
	 public static void uncapitalizeTest3(){
			String expected = "xyz";
			String actual = uncapitalize("Xyz");
			assertEquals(actual,expected);
	 }
	 public static void camelToSnakecaseTest1() {
			String expected = "abc";
			String actual = camelToSnakecase("Abc");
			assertEquals(actual,expected);
		}
	 public static void camelToSnakecaseTest2() {
			String expected = "abc_def";
			String actual = camelToSnakecase("AbcDef");
			assertEquals(actual,expected);
		}
	 public static void camelToSnakecaseTest3() {
			String expected = "abc_def_gh";
			String actual = camelToSnakecase("AbcDefGh");
			assertEquals(actual,expected);
		}
	 public static void snakeToCamelcaseTest1() {
			String expected = "Abc";
			String actual = snakeToCamelcase("abc");
			assertEquals(actual,expected);
		}
	 public static void snakeToCamelcaseTest2() {
			String expected = "AbcDef";
			String actual = snakeToCamelcase("abc_def");
			assertEquals(actual,expected);
		}
	 public static void snakeToCamelcaseTest3() {
			String expected = "AbcDefGh";
			String actual = snakeToCamelcase("abc_def_gh");
			assertEquals(actual,expected);
		}
	 public static void snakeToCamelcaseTest4() {
			String expected = "AbcDefGh";
			String actual = snakeToCamelcase("abc__def__gh");
			assertEquals(actual,expected);
		}
	 public static void snakeToCamelcaseTest5() {
			String expected = "AbcDef";
			String actual = snakeToCamelcase("_abc_def__ ");
			assertEquals(actual,expected);
		}
	public static String snakeToCamelcase(String snake_case) {
		String[] words;
		if(snake_case.contains("__")){
			words = snake_case.split("__");
		}else{
			words = snake_case.split("_");
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= words.length - 1; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
			}
			sb.append(Character.toLowerCase(c));
			j++;
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if(s != ""){
			char first = s.charAt(0);
			char upperFirst = Character.toUpperCase(first);
			String rest = s.substring(1);
			return upperFirst + rest;
		}
		return "";
	}

	static String uncapitalize(String s) {
		if(s == "") return "";
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
