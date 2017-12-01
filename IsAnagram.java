package oneptfour;

public class IsAnagram {
	
	public static boolean isAnagram(String stringA, String stringB) {
		if (stringA.length() != stringB.length())
			return false;
		int checklocation = 0;
		int[] check = new int[128];
		for (int i = 0; i < stringA.length(); i++) {
			checklocation = Character.getNumericValue(stringA.charAt(i));
			check[checklocation] += 1;
		}
		for (int i = 0; i < stringB.length(); i++) {
			checklocation = Character.getNumericValue(stringB.charAt(i));
			check[checklocation] -= 1;
		}
		for (int i = 0; i < check.length; i++) {
			if (check[i] > 0)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		String stringA = "cats";
		String stringB = "acts";
		System.out.println(isAnagram(stringA, stringB));
	}
}
