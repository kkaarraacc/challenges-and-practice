package oneptfourv2;

public class IsAnagramV2 {
	public static boolean isAnagram(String stringA, String stringB) {
		if (stringA.length() != stringB.length())
			return false;
		int stringAsum = 0;
		int stringBsum = 0;
		int asciivalue;
		for (int i = 0; i < stringA.length(); i++) {
			asciivalue = Character.getNumericValue(stringA.charAt(i));
			stringAsum += asciivalue*asciivalue;
		}
		for (int i = 0; i < stringB.length(); i++) {
			asciivalue = Character.getNumericValue(stringB.charAt(i));
			stringBsum += asciivalue*asciivalue;
		}
		if (stringAsum == stringBsum)
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		String stringA = "acts";
		String stringB = "cats";
		System.out.println(isAnagram(stringA, stringB));
	}
}
