/**
 * Use a while loop to find the largest integer n such that n3 is less than
 * 12,000.
 * 
 * @author Leon N.
 *
 */
public class Ex5_13 {
	public static void main(String[] args) {
		int n = 1;

		while (Math.pow(n, 3) < 12000) {
			n++;
		}

		System.out.println("This number is " + (n - 1));
	}
}
