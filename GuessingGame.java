//import
import java.util.Scanner;
import java.util.Random;
   
public class Main {
    private static final Random r = new Random();
    private static final int NUMBER = r.nextInt(100) + 1;
    private static int guessNum = 0;

    public static void main(String[] args) {  
        Scanner player1 = new Scanner(System.in);
            while ( guessNum != NUMBER ) {
            // Prompts player to  guess
            System.out.println("Player, please guess a number between 1 and 100");
            guessNum = player1.nextInt();
            if ( guessNum > NUMBER ) {
                System.out.println("Sorry! Number is too high,");
            } else if ( guessNum < NUMBER ) {
                System.out.println("Sorry! Number is too low,");
            } else 
            {
                System.out.println("That's right!");
                System.out.println("Thanks for playing!");
                System.out.println("Bye for now!");
                System.exit(0);
            }
        }
  }
}
