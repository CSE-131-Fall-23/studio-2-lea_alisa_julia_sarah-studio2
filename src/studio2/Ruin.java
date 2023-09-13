package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Hello, how much money are you starting with?");
		double startAmount = in.nextDouble();

		System.out.println("What is the probability you win a single play?");
		double winChance = in.nextDouble();

		System.out.println("What is your limit before you leave?");
		double winLimit = in.nextDouble();

		double UpdatedAmount = startAmount;

		System.out.println("How many days do you want to play?");
		double totalSimulations = in.nextDouble();
		
		double wins = 0;
		double losses = 0;
		
				
		

				for (double day = 1; day<=totalSimulations; day++)
				{
					while ((UpdatedAmount>0) && (UpdatedAmount < winLimit)) {

						if (Math.random() < winChance) {
							UpdatedAmount++;
						}
						else {UpdatedAmount--; 

						}
					}
					if (UpdatedAmount <= 0) {
						System.out.println("You lost");
						losses++;
					}
					else {
						System.out.println("You win");
						wins++;
					}
					UpdatedAmount = startAmount;
				}
				System.out.println(wins/totalSimulations);
	}
	
}

