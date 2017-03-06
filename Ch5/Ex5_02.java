/**
 * Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction
 * questions. Revise the program to generate ten random addition questions for
 * two integers between 1 and 15. Display the correct count and test time.
 * 
 * @author Leon N
 *
 */
import java.util.Scanner;

public class Ex5_02 {
	public static void main(String[] args) {
		int correctCount = 0; // Count the number of correct answers
		int count = 0; // Count the number of questions
		Scanner in = new Scanner(System.in);
		long startTime = System.currentTimeMillis();

		while (count < 10) {
			// 1. Generate two random single-digit integers
			int num1 = 1 + (int) (Math.random() * 15);
			int num2 = 1 + (int) (Math.random() * 15);

			// 2. Prompt the student to answer “what is number1 – number2?”
			System.out.print("What is " + num1 + " + " + num2 + "? ");
			int answer = in.nextInt();

			// 3. Grade the answer and display the result
			String replyString;
			if (num1 + num2 == answer) {
				replyString = "You are correct!";
				correctCount++;
			} else {
				replyString = "Your answer is wrong.\n" + num1 + " + " + num2 + " should be "
						+ (num1 + num2);
			}

			System.out.println(replyString);

			// Increase the count
			count++;
		}
		
		in.close();
		System.out.println("Correct count is " + correctCount);
		long endTime = System.currentTimeMillis();
		System.out.println("Time spent is " + (endTime - startTime) / 1000 + " seconds");
	}
}
