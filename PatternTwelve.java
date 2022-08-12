import java.util.*;
public class PatternTwelve
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");           // Pattern 
        int n = sc.nextInt(),val = 0, a=0,b=1;                              // 0 
        System.out.println("The Pattern for "+n+" rows is : ");             // 1  1
        for(int i =1; i<=n; i++)                                            // 2  3  5
        {                                                                   // 8  13  21  34  
            for(int j=1; j<=i; j++)                                         // 55  89  144  233  377
            {
                System.out.print("  "+a);
                val = a+b;
                a=b;
                b = val;
            }
            System.out.println();
        }
    }
}