import java.util.*;
public class DecimalToAnyBase {
    public static void display(int n, int b, int res)
    {
        System.out.println("The number "+n+" in base "+b+" = "+res);
    }
    public static int getInAnyBase(int n, int b)
    {
        int res = 0;
        int pow = 1;
        while(n>0)
        {
        int r = n % b;
        n = n /b;
        res += r * pow;
        pow = pow *10;
        }
        return res;
        
    }
    
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number n and base b");
            int n = sc.nextInt();
            int b = sc.nextInt();
            int res = getInAnyBase(n,b);
            display(n, b, res);
        }
    }
    
}
