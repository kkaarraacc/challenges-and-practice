package oneptthreev2;

import java.util.Hashtable;
import java.util.Set;

public class DeleteDupeCharsV2 {
	
	public static String deleteDupes(String string) {
		Hashtable table = new Hashtable();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			table.put(string.charAt(i), 0);
		}
		for (int i = 0; i < table.size(); i++) {
			sb.append(table.keySet().toArray()[i]);
		}
		return sb.toString();
	}
	public static void main(String args[]) {
		String string = "asdfdsasdfdsss";
		System.out.print(deleteDupes(string));
	}
}
