import java.util.*;
public class AnyBaseToAnyBase {
    
    public static int AnyBaseToDecimal(int n, int b1)
    {
        int res = 0;
        int pow = 1;
        while(n>0)
        {
        int r = n % 10;
        n = n / 10;
        res += r * pow;
        pow = pow * b1;
        }
        return res;
        
    }
    public static int DecimalToAnyBase(int n, int b2)
    {
        int res = 0;
        int pow = 1;
        while(n>0)
        {
        int r = n % b2;
        n = n / b2;
        res += r * pow;
        pow = pow *10;
        }
        return res;
        
    }
    public static int getValue(int n, int b1, int b2)
    {
        int dec = AnyBaseToDecimal(n,b1);
        int dn = DecimalToAnyBase(dec,b2);
        return dn;
    }
    
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number n");
            int n = sc.nextInt();
            System.out.println("Enter the base of number given");
            int b1 = sc.nextInt();
            System.out.println("Enter the base in which you want to convert");
            int b2 = sc.nextInt();
            int d = getValue(n, b1, b2);
            System.out.println("The number "+n+" in base "+b1+" is in base "+b2+" = "+d);
        }
    }
    
}
 
