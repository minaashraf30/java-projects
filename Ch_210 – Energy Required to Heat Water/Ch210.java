import java.util.Scanner;
public class Ch_210{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double m = input.nextDouble();	
		System.out.print("Enter the initial temperature: ");	
		double ti = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double tf = input.nextDouble();
		double q = ((tf - ti) * m * 4184);
		System.out.println("The energy needed is " + q);
  }
}
