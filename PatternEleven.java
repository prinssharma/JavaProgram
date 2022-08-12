import java.util.*;
public class PatternEleven
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");           // Pattern 
        int n = sc.nextInt(),val = 1;                                       // 1 
        System.out.println("The Pattern for "+n+" rows is : ");             // 2  3
        for(int i =1; i<=n; i++)                                            // 4  5  6
        {                                                                   // 7  8  9  10  
            for(int j=1; j<=i; j++)                                         // 11  12  13  14  15
            {
                System.out.print("  "+val);
                val++;
            }
            System.out.println();
        }
    }
}