import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        int mark = in.nextInt();

        if(mark<= 100 && mark>=90){
            System.out.println("Your grade is A");
        }
        else if (mark<= 89 && mark>=80){
            System.out.println("Your grade is B");
        }
        else if(mark<= 79 && mark>=70){
            System.out.println("Your grade is C");
        }
        else if(mark<= 69 && mark>=60){
            System.out.println("Your grade is D");
        }
        else if(mark< 60 && mark>= 0){
            System.out.println("Your grade is F");
        }
        else{
            System.out.println("Enter a valid mark!!");
        }
        
    }
}
