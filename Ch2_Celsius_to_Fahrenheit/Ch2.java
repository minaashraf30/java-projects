import java.util.Scanner;
public class Ch_2{
	public static void main(String[] args){
		System.out.println("let's go");
		System.out.print("Enter a degree in celsius:");
		Scanner input = new Scanner(System.in);
		double celsius = input.nextDouble();
		double fahrenheit = (((9.0 / 5) * celsius) + 32);
		System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit");
  }
}
