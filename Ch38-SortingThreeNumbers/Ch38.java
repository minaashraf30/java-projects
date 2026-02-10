mport java.util.Scanner;
public class Ch38{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter 3 numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if(num1>num2){
			int temp = num1;
			num1 =num2;
			num2 = temp; 
		} 
		if(num2>num3){
			int temp = num2;
			num2 = num3;
			num3 = temp; 
		}
		if(num1>num2){
			int temp = num1;
			num1 =num2;
			num2 = temp; 
		}
		System.out.println("the numbers is " + num1 + " " + num2 +" " +num3); 	
	}
}
