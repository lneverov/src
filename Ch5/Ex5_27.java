/**
 * Write a program that displays all the leap years, ten per line, from 101 to
 * 2100, separated by exactly one space. Also display the number of leap years
 * in this period.
 * 
 * @author Leon N
 *
 */
public class Ex5_27 {
	public static void main(String[] args) {
		int countLeap = 0;
		final int NUMS_PER_LINE = 10;
		
		System.out.println("Below is the list of leap years starting from 101 to 2100\n");
		for(int i = 101; i <= 2100; i++) {
			if(i % 4 == 0) {
				countLeap++;
				System.out.print(i + " ");
				if(countLeap % NUMS_PER_LINE == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("Number of leap years during this period is " + countLeap);
	}
}
