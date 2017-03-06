
/**
 * Write a program that prompts the user to enter the
 * number of students and each student’s name and score, and finally displays the
 * student with the highest score and the student with the second-highest score.
 * 
 * @author Leon N
 */
import java.util.Scanner;

public class Ex5_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int numOfStudents = in.nextInt();
		int highScore = 0; // Highest score
		int secondHigh = 0; // Second highest score
		String highStudent = "";// Top student
		String secHigh = ""; // Second result name

		for (int i = 0; i < numOfStudents; i++) {
			System.out.print("Enter students name: ");
			String name = in.next();
			System.out.print("Enter students score: ");
			int score = in.nextInt();
			in.close();
			
			if (score > highScore) {
				secHigh = highStudent;
				secondHigh = highScore;
				highStudent = name;
				highScore = score;
			} else if (score > secondHigh) {
				secHigh = name;
				secondHigh = score;
			}
		}

		System.out.println("Student " + highStudent + " scored the highest with the score of " + highScore);
		System.out.println("Student " + secHigh + " is the second top result with the score of " + secondHigh);
	}
}
