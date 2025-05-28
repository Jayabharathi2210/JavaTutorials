import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to print it's multiplication table:");
        int num = in.nextInt();

        for(int i=1; i<=10; i++){
            int product = num*i;
            System.out.println(num+" * "+i+" = "+product);
        }

    }
}
