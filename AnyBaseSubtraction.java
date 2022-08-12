import java.util.*;
public class AnyBaseSubtraction {
    public static void display(int b, int n1, int n2, int res)
    {
        System.out.println("The difference of number "+n2+" and "+n1+" in base "+b+" = "+res);
    }
    public static int getResult(int b, int n1, int n2)
    {
        int res = 0;
        int pow = 1;
        int c = 0;
        while(n2 > 0)
        {
        int d1 = n1 % 10;
        int d2 = n2 % 10;
        n1 = n1 / 10;
        n2 = n2 / 10;
        int d = 0;
        d2 = d2 +c;
        if(d2 >= d1)
        {
          c = 0;
          d = d2 - d1;
        }
        else
        {
          c = -1;
          d = d2 + b - d1;
        }
        
        res += d * pow;
        pow = pow * 10;
        }
        return res;
        
    }
    
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter the base and two number (second number should be greater)");
          int b = sc.nextInt();
          int n1 = sc.nextInt();
          int n2 = sc.nextInt();
          int res = getResult(b, n1, n2);
          display(b, n1, n2, res);
        }
    }
    
}
