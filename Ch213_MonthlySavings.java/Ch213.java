import java.util.Scanner;
public class Ch_213{
	public static void main(String[] args){
		System.out.print("Enter the monthly saving amount: ");
		Scanner input = new Scanner(System.in);
		double monthlySaving = input.nextDouble();
		double a = 0.05/12;
		double a1 = monthlySaving * (1+ a);
		double a2 = (monthlySaving + a1) * (1+ a);
		double a3 = (monthlySaving + a2) * (1+a);
		double a4 = (monthlySaving + a3) * (1+a);
		double a5 = (monthlySaving + a4) * (1+a);
		double a6 = (monthlySaving + a5) * (1+a);
		System.out.println(" After the sixth month, the account value is " + a6);
  }
}
