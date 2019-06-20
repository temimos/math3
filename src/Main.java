/*
 *
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //This line will be ignored by the compiler
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from +1 ) + from;
            //but people will (hopefully) read it
        int guessedNumber = 0;

            //Anything after the // is ignored by Java.
        // System.out.println( "This line prints just fine." ); // I can include a comment after the working code..
        System.out.printf("The number is between %d and %d.\n", from, to);

            //
        do
            {
                System.out.print("Guess what the number is: ");
                guessedNumber = scan.nextInt();
                if (guessedNumber > randomNumber)
                    System.out.println("Your guess is too high!");
                else if (guessedNumber < randomNumber)
                    System.out.println("Your guess is too low!");
                else
                    System.out.println("You got it!");
            } while (guessedNumber != randomNumber);
        }
    }

