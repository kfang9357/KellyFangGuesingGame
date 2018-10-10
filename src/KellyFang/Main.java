package KellyFang;

import java.util.Scanner;
public class Main {

// objective 1
    public static void main(String[] args) {
	double num = Math.random();
	int random  = (int)(num*10);

	Scanner input = new Scanner(System.in);
	int guess;
	System.out.print("Guess my number");
	guess = input.nextInt();

	while (guess!=random)
    {
        System.out.print("Guess again");
        guess = input.nextInt();

    }
    System.out.print("You got it! The number is "+guess);

	//objective2
	Scanner input2 = new Scanner(System.in);
	int guess2 = 50;
	System.out.print("is your nummber "+50);
	String correct = input2.nextLine();
	while (!input2.equals("correct"));
		{
			if (correct.equals("lower"))
			{
				guess2 = (int) guess2/2;
			}
			else
			{
				guess2 = (int) guess2*(3/2);
			}
			System.out.print("is your number "+ guess2);
		}
    }

}



