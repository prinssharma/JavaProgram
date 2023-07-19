public class SwapTwoNo {
    public static void main(String[] args) {
        int a = 10, b = 25;

        //using third variable
        int temp = 0;
        temp = a;
        a= b;
        b= temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println("=====================");

        //without using third variable 
        a = a+b;
        b= a-b;
        a= a - b;

        System.out.println(a);
        System.out.println(b);
        System.out.println("=====================");
        // Swap using bitwise XOR operator (^) without temporary variable
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("=====================");
    }
}
