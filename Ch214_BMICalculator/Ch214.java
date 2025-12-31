import java.util.Scanner;
public class Ch_214{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter weight in pounds: ");
		double w = input.nextDouble();
		System.out.print(" Enter height in inches: ");
		double h = input.nextDouble();
		double q = w * 0.45359237;
		double n = h * 0.0254;
		double a = (q / (n*n));
		System.out.println(" BMI is " + a);
  }
}
