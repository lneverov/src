/**
 * 
 * Write a program that prints the characters in the ASCII character table from
 * ! to ~. Display ten characters per line. The ASCII table is shown in Appendix
 * B. Characters are separated by exactly one space.
 *
 *@author Leon N.
 */
public class Ex5_15 {
	public static void main(String[] args) {
		for (int i = '!', count = 1; i <= '~'; i++)
	        System.out.print((count++ % 10 != 0) ? (char)i + " ": (char)i + "\n");
	  }
}
