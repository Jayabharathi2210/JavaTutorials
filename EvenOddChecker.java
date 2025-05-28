import java.util.Scanner;

public class EvenOddChecker {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int inputNum = in.nextInt();

        if(inputNum == 0){
            System.out.println("It's a Zero!");
        }
        else if(inputNum%2 == 0){
            System.out.println("It's an Even number.");
        }
        else{
            System.out.println("It's an Odd number.");
        }

    }
}
