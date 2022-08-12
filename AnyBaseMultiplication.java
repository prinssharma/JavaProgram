import java.util.*;
public class AnyBaseMultiplication 
{
    
    public static void display(int b, int n1, int n2, int res)
    {
        System.out.println("The multiplication of number "+n1+" with "+n2+" in base "+b+" = "+res);
    }

    public static int getProduct(int b, int n1, int n2)
    {
       int res = 0;
       int pow = 1;
      while (n2 > 0)
      {
        int d2 = n2 % 10;
        n2 = n2 / 10;

        int sprd = getProductWithASingleDigit(b, n1, d2);
        res = getResult(b, res, sprd * pow);
        pow = pow * 10;
        
      }
       return res;
    }
    public static int getProductWithASingleDigit(int b, int n1, int d2)
    {
        int res = 0;
        int c = 0;
        int pow = 1;
      while (n1 > 0 || c > 0)
      {
         int d1 = n1 % 10;
         n1 = n1 / 10;
         int d = d1 * d2 + c;
          c = d / b;
          d = d % b;
          res = res + pow * d;
         pow = pow * 10;
      }
        return res;
    }
    public static int getResult(int b, int n1, int n2)
    {
        int res = 0;
        int pow = 1;
        int c = 0;
        while(c > 0 || n1 > 0 || n2 > 0)
        {
        int d1 = n1 % 10;

        int d2 = n2 % 10;

        n1 = n1 / 10;

        n2 = n2 / 10;

        int d = d1 + d2 + c;

        c = d / b;

        d = d % b;

        res += d * pow;
        
        pow = pow * 10;
        }
        return res;
        
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the base and two number");
            int b = sc.nextInt();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int res = getProduct(b, n1, n2);
            display(b, n1, n2, res);
        }
    }
    
}
