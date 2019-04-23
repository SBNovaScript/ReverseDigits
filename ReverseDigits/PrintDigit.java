
public class PrintDigit {

	public static void printDigits(int number) {
		
		printHeaderFromNumber(number);
		
		number = NumberUtils.reverseDigits(number);
		number = printFirstDigitAndDivideBy10(number);
		
		// If the remaining digits are 0, we are done.
		if (number == 0)
			return;
					
		number = printMiddleDigitsUntilLessThan10(number);
		printLastDigit(number);
		
	}

	private static void printHeaderFromNumber(int number) {
		System.out.println(String.format("------------- Printing %s -------------", number));
	}

	private static void printLastDigit(int number) {
		System.out.println("Last digit: " + (number % 10));
	}

	private static int printMiddleDigitsUntilLessThan10(int number) {
		while(number > 9) {
			System.out.println("Next digit: " + (number % 10));
			number /= 10;
		}
		return number;
	}

	private static int printFirstDigitAndDivideBy10(int number) {
		System.out.println("First digit: " + (number % 10));
		number /= 10;
		return number;
	}

}
