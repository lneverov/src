/**
 * Write a program that solves the following equation and displays the value for
 * x and y: 
 * 3.4x + 50.2y = 44.5 
 * 2.1x + .55y = 5.9
 * 
 * @author Leon N
 *
 */
public class Ex1_13 {
	public static void main(String[] args) {
		System.out.print("x is ");
		System.out.println(((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));
		System.out.print("y is ");
		System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));
	}
}
