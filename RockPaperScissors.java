// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		//Initialize the Scanner 
		Scanner in = new Scanner(System.in);	
		//Welcome message
		System.out.println("Hello User! Welcome to the fun game of Rock, Paper, Scissors!");

		//while loop 
		while(true) {
		
			//Get the user's move through user input
			System.out.print(" Type  rock, paper, or scissors to make your move. If not, type quit to end the game. ");
			String userMove = in.nextLine();
			
			//Quit Check
			if(userMove.equals("quit")) {
				break;
			}

			//Is the user's move valid? 
			if(!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {

				System.out.println("Sorry. Your move isn't valid!");
			
			} else {
				int rand = (int)(Math.random()*3);
				
				String opponentMove = "";
				if(rand == 0) {
					opponentMove = "rock";
				} else if(rand == 1) {
					opponentMove = "paper";
				} else {
					opponentMove = "scissors";
				}
				System.out.println("Opponent move: " + opponentMove);
					
				//Print the results of the game: tie, lose, win
				if(userMove.equals(opponentMove)) {
					System.out.println("Tied!");
				} else if((userMove.equals("rock") && opponentMove.equals("scissors")) || (userMove.equals("scissors") && opponentMove.equals("paper")) || (userMove.equals("paper") && opponentMove.equals("rock"))) {
					System.out.println("Congrats! You won!");
				} else {
					System.out.println("Aw man! You lost!");
				}

			}

		}

	            System.out.println("Thanks for playing!");
                System.out.println("Bye for now!");
                System.exit(0);
		

  }
}
