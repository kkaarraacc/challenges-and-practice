package oneptone;

public class AllUnique {
	
	public static boolean allUnique(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) != ' ') {
				for (int j = 0; j < string.length(); j++) {
					if (string.charAt(i) == string.charAt(j))
						count ++;
					if (count > 1)
						return false;
				}
			}
			count = 0;
		}
		return true;
	}
	
	public static void main(String args[]) {
		String stringA = "this is not unique";
		String stringB = "qwer asdf zxcv";
		System.out.println(allUnique(stringA));
		System.out.println(allUnique(stringB));
	}
}
