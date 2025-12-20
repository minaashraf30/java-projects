import java.util.Scanner;
public class Ch_22{
	public static void main(String[] args){
		System.out.print(" Enter the radius and length of a cylinder: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = (radius * radius * 3.14);
		double volume = (area * length);
		System.out.println(" the area is " + area);
		System.out.println(" the volume is " + volume);
  }
}
