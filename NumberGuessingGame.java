import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rm = new Random();

        int guess = rm.nextInt(100);

        System.out.println("Guess the number(0-99): ");
        int input = in.nextInt();

        if(input > guess){
            System.out.println("It's too high! Guess again");
        }
        else if(input < guess){
            System.out.println("It's too low! Guess again");
        }
        else{
            System.out.println("Yaey! You guessed correctly!");
        }
        
    }
}
