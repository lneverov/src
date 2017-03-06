/**
 * 
 * A cancellation error occurs when you are manipulating a very large number
 * with a very small number. The large number may cancel out the smaller number.
 * For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0.
 * To avoid cancellation errors and obtain more accurate results, carefully
 * select the order of computation. For example, in computing the following
 * series, you will obtain more accurate results by computing from right to left
 * rather than from left to right: 1 + 1/2 + 1/3 + ... + 1/n Write a program that
 * compares the results of the summation of the preceding series, computing from
 * left to right and from right to left with n = 50000.
 *
 * @author Leon N	3/05/17
 */

public class Ex5_23 {
	public static void main(String[] args) {

		double left2Right = 0;
		double right2Left = 0;
		//Left to right
		for(double i = 1; i <= 5000; i++) {
			left2Right += 1/ i;
		}
		
		System.out.println("Left to right sum is " + left2Right);
		//RightToLeft
		for(double i = 5000; i >= 1; i--) {
			right2Left += 1 / i;
		}
		
		System.out.println("Right to left sum is " + right2Left);
		System.out.println("The difference is " + (right2Left - left2Right));
	}
}
