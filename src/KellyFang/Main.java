package KellyFang;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double num = Math.random();
	int random  = (int)(num*101);

	Scanner input = new Scanner(System.in);
	int guess;
	System.out.print("Guess my number");
	guess = input.nextInt();

	while (guess!=random)
    {
        System.out.print("Guess again");
        guess = input.nextInt();

    }
    System.out.print("You got it! The word is "+guess);
    }
}



