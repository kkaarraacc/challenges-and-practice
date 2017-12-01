package oneptthree;

public class DeleteDupeChars {
	
	public static String deleteDupeChars(String string) {
		int count = 0;
		int i = 0;
		int j = 0;
		boolean deleted = false;
		StringBuilder sb = new StringBuilder(string);
		while ( i < sb.length()) {
			if (sb.charAt(i) != ' ') {
				while (j < sb.length()) {
					if (sb.charAt(i) == sb.charAt(j))
						count ++;
					if (count > 1) {
						sb.deleteCharAt(j);
						deleted = true;
						count = 0;
					}
					if (!deleted)
						j ++;
					deleted = false;
				}
			}
			i++;
			j = i;
			count = 0;
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		String string = "hello this contains many duplicate chars";
		string = deleteDupeChars(string);
		System.out.println(string);
	}
}
