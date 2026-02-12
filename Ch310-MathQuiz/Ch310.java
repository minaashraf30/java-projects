import java.util.Scanner;
public class Ch310{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int num1 =(int) (Math.random()*10);
		int num2 =(int) (Math.random()*10);
		if(num1 < num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(" what is " + num1 + " - " + num2 + " ?");
		int answer = input.nextInt();
		if(num1 - num2 == answer)
			System.out.println("you are correct");
		else{
			System.out.println("you are wrong");
			System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
		}
		int num3 = (int) (Math.random()*100);
		int num4 = (int) (Math.random()*100);
		System.out.println(" what is " + num3 + " + " + num4 + " ?");
		int answer2 = input.nextInt();
		if(num3 + num4 == answer2)
			System.out.println("you are correct");
		else{
			System.out.println("you are wrong");
			System.out.println(num3 + " + " + num4 + " should be " + (num3 +num4));
		}	
	}
}
