
/**
 * Write
 *	a program that reads an unspecified number of integers, determines how many
 *	positive and negative values have been read, and computes the total and average of
 *	the input values (not counting zeros). Your program ends with the input 0. Display
 *	the average as a floating-point number.
 *  @author Leon N
 */
import java.util.Scanner;

public class Ex5_01 {
	// Main Method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int positive = 0; // Positive number count
		int negative = 0; // Negative number count
		float average = 0; // Average = sum / total values
		double sum = 0; // Sum of value

		// Prompt the user to enter a value
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num = in.nextInt();

		if (num == 0) {
			System.out.println("No numbers are entered except 0");
		} else {
			while (num != 0) {
				if (num > 0) {
					positive++;
					sum += num;
				} else {
					sum += num;
					negative++;
				}
				average = (float) sum / (negative + positive);
				num = in.nextInt();

			}
			in.close();
			System.out.println("The number of positives is " + positive);
			System.out.println("The number of negatives is " + negative);
			System.out.println("The total is " + sum);
			System.out.println("The avarage is " + average);
		}
	}
}
