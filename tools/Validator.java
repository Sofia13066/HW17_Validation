package tools;

public class Validator {
	public static boolean checkCreditCard(String str) {
		String pattern = "\\d{8,16}";
		return str.matches(pattern);
	}
	public static boolean checkDateFormatEU(String str) {
		String pattern = "([0-2][1-9]|[2][0]|[3][0-1])[.]([0][1-9]|[1][0-2])[.]([0-9][0-9][0-9][0-9])";
		return str.matches(pattern);
	}
	public static boolean checkDateFormatUS(String str) {
		String pattern = "([0-9][0-9][0-9][0-9])\\-([0][1-9]|[1][0-2])\\-([0-2][1-9]|[2][0]|[3][0-1])";
		return str.matches(pattern);
	}
	public static boolean checkPhoneNumber(String str) {
		String pattern = "\\+[0-9][0-9][(][0-9][0-9]\\)[0-9][0-9][0-9][0-9]\\-[0-9][0-9][0-9][0-9]";
		return str.matches(pattern);
	}
	public static boolean checkLessEquals255(String str) {
		String pattern = "[0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]";
		return str.matches(pattern);
	}
	
}