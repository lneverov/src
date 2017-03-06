/**
 * Suppose that the tuition for a university is $10,000 this year and increases
 * 5% every year. In one year, the tuition will be $10,500. Write a program that
 * computes the tuition in ten years and the total cost of four years’ worth of
 * tuition after the tenth year.
 * 
 *@author Leon N
 */
public class Ex5_07 {
	public static void main(String[] args) {
		
		double interest = 0.05;	//Interest
		double yearTuition = 10000;	//Tuition for one year
		double tenYearsTuition = yearTuition * 10 * interest + yearTuition;	//Yearly tuition cost in ten years
		double fourYearsTuition = tenYearsTuition * interest * 4 + tenYearsTuition;
		
		System.out.printf("Tuition cost in ten years: %.2f\nThe total cost of four years worth of tuition after ten years is %.2f"
				,tenYearsTuition, fourYearsTuition);
	}
}
