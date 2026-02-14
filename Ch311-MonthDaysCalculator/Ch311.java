import java.util.Scanner;
public class Ch311{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		switch(month){
			case 1: System.out.println("january and year " + year + " has 31 days");
				break;
			case 2: if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
						System.out.println("february and year " + year + " has 29 days");
					else
						System.out.println("february and year " + year + " has 28 days");
					break;
			case 3: System.out.println("march and year " + year + " has 31 days");
					break;
			case 4: System.out.println("april and year " + year + " has 30 days");
					break;
			case 5: System.out.println("may and year " + year + " has 31 days");
					break;
			case 6: System.out.println("june and year " + year + " has 30 days");
					break;
			case 7: System.out.println("july and year " + year + " has 31 days");
					break;
			case 8: System.out.println("august and year " + year + " has 31 days");
					break;
			case 9: System.out.println("september and year " + year + " has 30 days");
					break;
			case 10: System.out.println("october and year " + year + " has 31 days");
					break;
			case 11: System.out.println("november and year " + year + " has 30 days");
					break;
			case 12: System.out.println("december and year " + year + " has 31 days");
					break;
			default: System.out.println("Invalid month");
		}
	}
}
