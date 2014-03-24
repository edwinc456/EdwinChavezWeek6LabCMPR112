import java.util.Scanner;

public class week6lab 
{
public static void main(String[]args)
	{
	 int computerNum;
	 int num2;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Press 1 for rock, 2 for paper, 3 for scissors: ");
	 num2=input.nextInt();
	 computerNum= 0 + (int)(Math.random()*3);
	 if(computerNum == num2)
	 {
		 System.out.printf("It has been a draw! both of you selected %d! Thank you for playing!" , computerNum);
		 
	 }
	 else if(computerNum<num2)
	 {
		 System.out.printf("Your opponent chose %d. Thank you for playing!",computerNum);
		
	 }
	 else if(computerNum>num2)
	 {
		 System.out.printf("Your opponent chose %d. Thank you for playing!", computerNum );
	 }
	}
}

// NOt quite, Edwin.  Are you familiar with the Rock/PaperScissor game?
