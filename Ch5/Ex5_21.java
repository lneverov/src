/**
 * 
 * Write a program that lets the user enter the loan amount and loan period in
 * number of years and displays the monthly and total payments for each interest
 * rate starting from 5% to 8%, with an increment of 1/8
 *
 *@author Leon N
 */
import java.util.Scanner;

public class Ex5_21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Loan amount: ");
		double amount = in.nextDouble();
		
		System.out.print("Number of years: ");
		int numOfYears = in.nextInt();
		in.close();
		
		double interestRate = 5;
		double monthlyPayment = 0;
		double totalPayment = 0;
		String s ="%";
		
		System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");
		
		for(double interest = 0.05; interest < 0.08125; interest += 0.00125) {
			monthlyPayment = ((interest / 12) * amount) / (1 - Math.pow(1 + (interest / 12), -(numOfYears * 12)));
			totalPayment = monthlyPayment * numOfYears * 12;
			
			System.out.printf("%-1.3f%s %17.2f %23.2f \n", interestRate, s, monthlyPayment, totalPayment );
			interestRate += .125;
		}
		
	}
}
