public class TypeCasting {
    
    public static void main(String[] args) {
        
        double num1 = 123.456d;
        System.out.println("Double to int: ");
        int num1Result = (int)num1;
        System.out.println(num1+" -> "+num1Result);

        int num2 = 12345;
        System.out.println("Int to double: ");
        double num2Result = num2;
        System.out.println(num2+" -> "+num2Result);
    }
}
