package labPart2;

public class labPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		for (String name : names) {
			int sumOfLetters = 0;
			sumOfLetters += name.length();
		
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
			
			System.out.println(hasMoreEvenWords(names));
			System.out.println(isPalindrome("not a palindrome"));
		}
		}
	}
	public static int[] extractStringLengths(String [] strings) {
		int[] results = new int[strings.length];
		for (int i=0; i<strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	public static boolean hasMoreEvenWords(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		for (String string :array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
			}
		return false;
		
	}
	public static boolean isPalindrome(String string) {
		for (int i = 0; i< string.length() /2; i++){
		if (string.charAt(i) != string.charAt(string.length() - i -1)) {
			return false;
		}
		}
	return true;
	}

}
