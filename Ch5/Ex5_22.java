
/**
 * 
 * The monthly payment for a given loan pays the principal and the interest. The
 * monthly interest is computed by multiplying the monthly interest rate and the
 * balance (the remaining principal). The principal paid for the month is
 * therefore the monthly payment minus the monthly interest. Write a program
 * that lets the user enter the loan amount,number of years, and interest rate
 * and displays the amortization schedule for the loan.
 *
 * @author Leon N. 03/05/17
 */
import java.util.Scanner;

public class Ex5_22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double amount = in.nextDouble();

		System.out.print("Number of Years: ");
		int numOfYears = in.nextInt();

		System.out.print("Annual Interest Rate: ");
		double annualInterest = in.nextDouble();
		in.close();

		double interest;
		double principal;
		double monthlyInterestRate = annualInterest / 1200;
		double monthlyPayment = (monthlyInterestRate * amount) / (1 - Math.pow((1 + monthlyInterestRate), -(numOfYears * 12)));
		
		System.out.println("");

		System.out.printf("Mothly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n\n", (monthlyPayment * numOfYears * 12));
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		
		for (int i = 1; i <= numOfYears * 12; i++) {
			interest = monthlyInterestRate * amount;
			principal = monthlyPayment - interest;
			amount -= principal;
			
			System.out.printf("%-1d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, amount);
		}
	}
}
