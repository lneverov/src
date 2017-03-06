/**
 * 
 * Write a nested for loop that prints the following output: 1 1 2 1 1 2 4 2 1 1
 * 2 4 8 4 2 1 1 2 4 8 16 8 4 2 1 1 2 4 8 16 32 16 8 4 2 1 1 2 4 8 16 32 64 32
 * 16 8 4 2 1 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 *
 *@author Leon N
 */
public class Ex5_19 {
	public static void main(String[] strings) {

		String s = " ";
		int num = 0;
		
		for (int row = 0; row <= 7; row++) {
			for (int col = 1; col <= 7 - row; col++) {
				System.out.printf("%4s", s);
			}

			for (int col = 0; col <= row; col++) {
				num = (int) Math.pow(2, col);

				System.out.printf("%4d", num);
			}

			for (int col = row - 1; col >= 0; col--) {
				num = (int) Math.pow(2, col);

				System.out.printf("%4d", num);
			}
			System.out.println();
		}
	}
}
