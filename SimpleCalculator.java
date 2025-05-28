import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Choose an operation: ");
        System.out.println("+ - * /");
        char operand = in.next().charAt(0);

        switch(operand)
        {
            case '+':
            System.out.println(num1+num2);
            break;

            case '-':
            System.out.println(num1-num2);
            break;

            case '*':
            System.out.println(num1*num2);
            break;

            case '/':
            System.out.println(num1/num2);
            break;

            default:
            System.out.println("Choose a valid operation!");
        }

        in.close();

    }
    
}
