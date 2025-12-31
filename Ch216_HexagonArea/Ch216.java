import java.util.Scanner;
public class Ch_216{
	public static void main(String[] args){
	  System.out.print(" Enter the length of the side: ");
	  Scanner input = new Scanner(System.in);
	  double sideLength = input.nextDouble();
	  double area =(((3 * Math.pow(3,0.5))/2)*(Math.pow(sideLength,2)));
	  System.out.println("The area of the hexagon is " + area); 
  }
}
