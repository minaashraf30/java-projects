import java.util.Scanner;
public class Ch35{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today’s day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int numOfDays = input.nextInt();
		int numOfDays2 = (today + numOfDays) % 7;
		if(today < 0 || today > 6){
			System.out.println("your input is wrong");
			return;
		}
		if(today == 0)
			System.out.println("sunday");
		else if(today == 1)
			System.out.println("monday");
		else if(today == 2)
			System.out.println("tuesday");
		else if(today == 3)
			System.out.println("wednesday");
		else if(today == 4)
			System.out.println("thursday");
		else if(today == 5)
			System.out.println("friday");
		else if(today == 6)
			System.out.println("saturday");
		switch(numOfDays2){
			case 0: System.out.println(" and the future day is sunday");
				break;
			case 1: System.out.println(" and the future day is monday");
				break;
			case 2: System.out.println(" and the future day is tuesday");
				break;
			case 3: System.out.println(" and the future day is wednesday");
				break;
			case 4: System.out.println(" and the future day is thursday");
				break;
			case 5: System.out.println(" and the future day is friday");
				break;
			case 6: System.out.println(" and the future day is saturday");
				break;
		}
	}
}
