import java.util.Scanner;
public class Ch_25{
	public static void main (String[] args){
	  System.out.print(" Enter the subtotal and a gratuity rate: ");
	  Scanner input = new Scanner(System.in);
	  double subtotal = input.nextDouble();
	  double gratuity = input.nextDouble();
	  double gratuity_2 = (gratuity / 100) * subtotal;
	  double total = (gratuity_2 + subtotal);
	  System.out.println(" the gratuity is " + gratuity_2 + "$" + " and total is " + total + "$");
  }
}
