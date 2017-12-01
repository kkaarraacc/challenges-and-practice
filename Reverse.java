package onepttwo;

public class Reverse {
	
	public static char[] reverse(char[] array) {
		char[] temp = new char[array.length];
		int tempi = 0;
		for (int i = array.length-1; i >= 0; i --) {
			temp[tempi] = array[i];
			tempi ++;
		}
		return temp;
	}

	public static void main(String args[]) {
		char[] array = new char[] {'h', 'e', 'l', 'l', 'o'};
		array = reverse(array);
		System.out.println(array);
	}
}
