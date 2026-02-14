import java.util.Scanner;
public class Ch312{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int digit = input.nextInt();
		if (digit < 100 || digit > 999) {
            System.out.println("Please enter a valid three-digit integer");
			return;
		}
		int num3 = digit % 10;
		int num1 = (digit /100) % 10;
		if(num3 == num1){
			System.out.println(digit + " is a palindrome");
		}		
		else
			System.out.println(digit + " is not a palindrome");
	}
}
