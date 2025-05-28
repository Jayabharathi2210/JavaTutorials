public class OperatorPrecedence {
    
    public static void main(String[] args) {
        
        int num1 = 10 * 5 + 2;
        int num2 = (10 * 5) + 2;
        int num3 = 10 * (5 + 2);
        int num4 = 100 / 10 * 5;
        int num5 = 100 / (10 * 5);

        System.out.println("Operator Precedence Example:");
        System.out.println("10 * 5 + 2 gives "+num1);
        System.out.println("(10 * 5) + 2 gives "+num2);
        System.out.println("10 * (5 + 2) gives "+num3);
        System.out.println("100 / 10 * 5 gives "+num4);
        System.out.println("100 / (10 * 5) gives "+num5);

    }
}
