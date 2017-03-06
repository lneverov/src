/**
 * Write a program that displays the e value for i = 10000, 20000, …, and
 * 100000.
 * 
 * 
 * *********!!!!! There are 2 logic errors in the book solution !!!!!****
 * @author Leon N
 *
 */

public class Ex5_26 {
	public static void main(String[] args) {
		double numerator = 1;
		double sum = 0;
		
		for (int i = 1; i <= 100000; i++) {
			sum += numerator / i;

			if (i % 10000 == 0) {
				System.out.println("e value for i = " + i + " is " + sum);
			}
		}
	}
}
