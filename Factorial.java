import java.util.Scanner;
public class Factorial {
    public static int fact(int n)
    {
        int val = 0;
        if(n == 1)
        return 1;
         val =  n * fact(n - 1);
        return val;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no. for factorial");
            int n = sc.nextInt();
            int f = fact(n);
            System.out.print("Factorial of "+n+ " is : "+f);
        }

        System.out.println();
    }
    
}
