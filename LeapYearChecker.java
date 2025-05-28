import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = in.nextInt();

        if(year%4 == 0){
            if(year%100 !=0 || year%400 == 0){
                System.out.println("It's a leap year!");
            }
            else{
                System.out.println("It's not a leap year!");
            }
        }
        else{
            System.out.println("It's not a leap year!");
        }
        
    }
    
}
