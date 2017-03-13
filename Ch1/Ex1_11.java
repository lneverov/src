/**
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days. Hint:
 * In Java, if two integers perform division, the result is an integer. The
 * fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4
 * is 2 (not 2.5). To get an accurate result with the fractional part, one of
 * the values involved in the division must be a number with a decimal point.
 * For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 * 
 * @author Leon N
 *
 */
public class Ex1_11 {
	public static void main(String[] args) {
		//86400 seconds in one day
		System.out.print("Population in 1 year will be: ");
		System.out.println((int)(((86400 / 7.0) + (86400 / 45) - (86400 / 13.0)) * 365) + 312032486);
		
		System.out.print("Population in 2 years will be: ");
		System.out.println((int)(((86400 / 7.0) + (86400 / 45) - (86400 / 13.0)) * (365 * 2)) + 312032486);
		
		System.out.print("Population in 3 years will be: ");
		System.out.println((int)(((86400 / 7.0) + (86400 / 45) - (86400 / 13.0)) * (365 * 3)) + 312032486);
		
		System.out.print("Population in 4 years will be: ");
		System.out.println((int)(((86400 / 7.0) + (86400 / 45) - (86400 / 13.0)) * (365 * 4)) + 312032486);
		
		System.out.print("Population in 5 years will be: ");
		System.out.println((int)(((86400 / 7.0) + (86400 / 45) - (86400 / 13.0)) * (365 * 5)) + 312032486);
	}
}
