import java.util.*;
public class AnyBaseToDecimal {
    public static void display(int n, int b, int res)
    {
        System.out.println("The number "+n+" in base 10 "+" = "+res);
    }
    public static int getInDecimal(int n, int b)
    {
        int res = 0;
        int pow = 1;
        while(n>0)
        {
        int r = n % 10;
        n = n / 10;
        res += r * pow;
        pow = pow * b;
        }
        return res;
        
    }
    
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number n and base b");
            int n = sc.nextInt();
            int b = sc.nextInt();
            int res = getInDecimal(n,b);
            display(n, b, res);
        }
    }
    
}
 
