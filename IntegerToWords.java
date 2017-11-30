public class IntegerToWords {

	static String convertToString(int number) {
		StringBuilder string = new StringBuilder();
		
		int length = Integer.toString(number).length();
		int temp;
		
		String[] ones = {"", "One", "Two", "Three", "Four", "Five",
				           "Six", "Seven", "Eight", "Nine"};
		String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
				          "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] tens = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifthy",
				         "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] hundred = {"", "Hundred", "Thousand"};
		
		if (number == 0) {
			string.append("Zero");
		}
		else {
			if (length > 3 && length % 2 == 0)
				length ++;
			do {
				if (length > 3) {
					temp = (number / (int)Math.pow((double)10, (double)length - 2));
					if (temp/10 == 1 && temp%10 != 0) {
						string.append(teens[temp/10]);
					}
					else {
						string.append(tens[temp/10]);
						string.append(ones[temp%10]);
					}
					if (temp > 0) {
						string.append(hundred[length/2]);
					}
					number = number%(int)(Math.pow((double)10, (double)length-2));
					length = length-2;
				}
				else {
					temp = number / 100;
					if (temp != 0) {
						string.append(ones[temp]);
						string.append(hundred[length/2]);
					}
					temp = number%100;
					if (temp/10 == 1 && temp%10 != 0) {
						string.append(teens[temp%10]);
					}
					else {
						string.append(tens[temp/10]);
						string.append(ones[temp%10]);
					}
					length = 0;
				}
			}
			while (length > 0);
		}
		return string.toString();
	}
	
	public static void main(String args[]) {
		int number = 43594;
		System.out.println(convertToString(number));
	}
}
