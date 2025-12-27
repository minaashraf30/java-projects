import java.util.Scanner;
public class Ch_26{
	public static void main(String[] args){
	  System.out.print(" Enter a number between 0 and 1000: ");
	  Scanner input = new Scanner(System.in);
	  int number = input.nextInt();
	  int num_1 = (number % 10);
	  int temp = (number / 10);
	  int num_2 = (temp % 10);
	  int temp2 = ( temp / 10);
	  int num_3 = (temp2 % 10);
	  int total = ( num_1 + num_2 + num_3);
	  System.out.println(" the sum of the digits is " + total);
  }
}
