import java.util.Scanner;
public class Ch_211{
	public static void main(String[] args){
		System.out.print("Enter the number of years: ");
		Scanner input = new Scanner(System.in);
		int years = input.nextInt();
		int population = 312032486;
		int seconds = years * 365 * 24 * 60 * 60 ;
		int births = seconds / 7;
		int deaths = seconds / 13;
		int immigrants = seconds / 45;
		int populationYears = population +  births - deaths - immigrants;
		System.out.println("The population in " + years + " years is " + populationYears);
  }
}
