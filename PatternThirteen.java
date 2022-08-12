import java.util.*;
public class PatternThirteen
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");           // Pattern 
        int n = sc.nextInt();                                               // 1 
        System.out.println("The Pattern for "+n+" rows is : ");             // 1  1
        for(int i =0; i<n; i++)                                             // 1  2  1
        {    int icj = 1;                                                   // 1  3  3  1  
            for(int j=0; j <= i; j++)                                       // 1  4  6  4  1
            {
                System.out.print("  "+icj);
                int icjp1 = icj * (i - j)/(j+1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}