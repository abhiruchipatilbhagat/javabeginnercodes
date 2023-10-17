import java.util.Random;
import java.util.Scanner;

public class Game{
    static int noOfGuesses = 0;
    static int guess;
    static int random;

    public Game(){
        Random rand = new Random();
        random = rand.nextInt(10);
    }

    public void takeUserInput(int a){
        guess = a;
        isCorrectNumber();
    }

    public static void isCorrectNumber(){
        if(random==guess){
            System.out.println("You guessed it right!");
        }
        else{
            if(guess>random){
                System.out.println("Enter a smaller number");
                noOfGuesses += 1;
            }
            else{
                System.out.println("Enter a larger number");
                noOfGuesses += 1;
            }
        }
    }

    public static void main(String[] args){
        Game game1 = new Game();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter your guess: ");
            int userInput = scanner.nextInt();
            game1.takeUserInput(userInput);
            if(random == guess){
                noOfGuesses += 1;
                System.out.println("You took " + noOfGuesses + " guesses.");
                break;
            }
        }
    }
}
