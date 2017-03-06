/**
 * Write a program that prompts the user to enter an integer from 1 to 15 and
 * displays a pyramid
 * 
 * 
 *@author Leon N
 */
import java.util.Scanner;

public class Ex5_17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of lines (1-15): ");
		int numOfLines = in.nextInt();

		if (numOfLines < 1 || numOfLines > 15) {
			System.out.println("Invalid entry");
			System.out.print("Enter the number of lines (1-15): ");
			numOfLines = in.nextInt();
		}
		in.close();
		for (int row = 1; row <= numOfLines; row++) {

			for (int col = 1; col <= numOfLines - row; col++) {
				System.out.printf("%3s", " ");
			}
			for (int val = row; val >= 1; val--) {
				System.out.printf("%3d", val);
			}
			for (int val = 2; val <= row; val++) {
				// System.out.print(" " + number);
				System.out.printf("%3d", val);

			}
			System.out.println();

		}
	}
}
