package oneptfive;

public class ReplaceSpaces {
	
	public static String replaceSpaces(String string, String spacereplace) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i ++) {
			if (string.charAt(i) != ' ')
				sb.append(string.charAt(i));
			else
				sb.append(spacereplace);
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		String string = "hey this is the string";
		String spacereplace = "%20";
		System.out.println(replaceSpaces(string, spacereplace));
	}
}
