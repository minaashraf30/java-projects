import java.util.Scanner;
public class Ch_23{
	public static void main(String[] args){
	System.out.print(" Enter a value for feet: ");
	Scanner input = new Scanner(System.in);
	double feetValue = input.nextDouble();
	double feet = (feetValue * 0.305);
	System.out.println( feetValue + " feet is " + feet + " meters");
	}
}
