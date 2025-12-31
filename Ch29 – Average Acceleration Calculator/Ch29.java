import java.util.Scanner;
public class Ch_29{
	public static void main(String[] args){
		System.out.print("Enter v0 v1 and t: ");
		Scanner input = new Scanner(System.in);
		double intial = input.nextDouble();
		double v = input.nextDouble();
		double t = input.nextDouble();
		double a = ( v - intial) / t;
		System.out.println(" The average acceleration is " + a);
	}
}
