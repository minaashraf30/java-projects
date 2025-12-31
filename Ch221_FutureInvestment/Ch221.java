import java.util.Scanner;
public class Ch_221{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investment = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		double monthlyRate = annualInterestRate / 1200;
		double futureValue = investment * Math.pow((1 + monthlyRate), years * 12);
		System.out.println("Future value is " + futureValue);
  }
}
