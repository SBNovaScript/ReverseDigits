
public class NumberUtils {

	public static int reverseDigits(int number) {
		int newNum = 0;
		
		while(number > 0) {
			newNum *= 10;
			newNum += (number % 10);
			number /= 10;
		}
		
		return newNum;
	}
	
}
