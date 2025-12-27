import java.util.Scanner;
public class Ch_27{
	public static void main(String[] args){
	  System.out.print(" Enter the numbers of minutes: ");
	  Scanner input = new Scanner(System.in);
	  int minutes = input.nextInt();
	  int hours = (minutes / 60);
	  int days = (hours / 24);
	  int theDays = (days % 365);
	  int years = (days /365);
	  System.out.println(minutes + " minutes is approximately " + years + " years and " + theDays + " days");
  }
}
