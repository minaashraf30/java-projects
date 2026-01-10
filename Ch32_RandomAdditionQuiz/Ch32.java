import java.util.Scanner;
public class Ch_32{
	public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  int num1 = (int)(Math.random() * 10);
	  int num2 = (int)(Math.random() * 10);
	  int num3 = (int)(Math.random() * 10);
	  System.out.print("what is " + num1 + " + " + num2 + " + " + num3 + " ? ");
	  System.out.print(" enter the sum: ");
	  int answer = input.nextInt();
	  if(answer == (num1 + num2 +num3)){
				    System.out.println(" you are correct");
    }
	  else{
	          System.out.println("you are wrong");
	  }
  }
}
