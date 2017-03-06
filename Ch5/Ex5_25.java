/**
 * Compute pi Write a program that displays the p value for i = 10000, 20000, …,
 * and 100000.
 * 
 * @author Leon N. 03/05/17
 *
 */
public class Ex5_25 {
	public static void main(String[] args) {
		double pi = 0;
		
		for(int k = 1; k <= 100000; k++) {
			pi += Math.pow(-1, k + 1) / (2 * k - 1);
			
			if(k == 10000 || k == 20000 || k == 30000 || k == 40000 || k == 50000
					|| k == 60000 || k == 70000 || k == 80000 || k == 90000 || k == 100000) {
				System.out.println("Pi value for i = " + k + " is " + (4 * pi));
			}
		}
	}
}
//Pi is 3.1414926535900345 //i = 10000
//Pi is 3.1415426535898248 //i = 20000;
//Pi is 3.1415826535897198 //i = 100000

