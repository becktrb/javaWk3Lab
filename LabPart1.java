
public class LabPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[6];
		numbers[0] = 1;
		numbers[1] = 5;
		numbers[2] = 2;
		numbers[3] = 8;
		numbers[4] = 13;
		numbers[5] = 6;
		System.out.println(numbers[0]);
		System.out.println(numbers.length-1);
		//System.out.println(numbers[6]);  out of bounds
		//System.out.println(numbers[-1]); out of bounds
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int number : numbers) {
			System.out.println(number);
		}
		int sum = 0;
		for (int number : numbers) {
			sum += number;
			System.out.println(sum);
		}
		int average = sum / numbers.length;
		System.out.println(average);
		
		for (int number : numbers) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
		String[] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		for (String name : names) {
			int sumOfLetters = 0;
			sumOfLetters += name.length();
		}
		greet("Tom");
		greetAgain("Tom");
		System.out.println(greetAgain("Tom"));
		isStringLongerThanNumber("Hello", 3);
		System.out.println((isStringLongerThanNumber("Hello", 3)));
		System.out.println(doesArrayContainString(names, "Sam"));
		System.out.println(getSmallestInArray(numbers));
		
		
		
		
		
		
		double[] doubles = {45.59, 43.43, 23.23};{
		System.out.println(getAverage(doubles));}
	}
	
		public static void greet(String name) {
			System.out.println("Hi " + name);
		}
		
		public static String greetAgain(String name) {
			return "Hi " + name;
		} //must add return, change return type.  must sysout the return
		
		public static boolean isStringLongerThanNumber (String string, int number) {
			if (string.length() > number) {
				return true;
			}else {
				return false;
			}
			
			
			
		}
		public static boolean doesArrayContainString(String[] array, String string) {
			for (String str : array) {
				if (str.equals(string)) {
					return true;
				}
			}return false;
		}
		
		public static int getSmallestInArray(int [] numbers) {
			int smallest = numbers[0];
			for (int num : numbers) {
				if (num < smallest) {
					smallest = num;
				}
				
			}
			return smallest;
		}
		
		public static double getAverage(double[] doubles) {
			double sum = 0;
			for (double num : doubles) {
				sum += num;
				
			}
		 return sum / doubles.length;
		
}
		
		
		
		
}
		

		
