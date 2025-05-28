import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int num = in.nextInt();

        int factorial = 1;
        int i = num;

        while(i>=1){
            factorial = factorial*i;
            i--;
        }
        System.out.println("Factorial - "+factorial);
    }
}
