import java.util.*;
public class PatternTwo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");           // Pattern   
        int n = sc.nextInt();                                               // 1  1  1  1  1
        System.out.println("The Pattern for "+n+" rows is : ");             // 1  1  1  1
        for(int i =1; i<=n; i++)                                            // 1  1  1  
        {                                                                   // 1  1  
            for(int j=n; j>=i; j--)                                         // 1
            {
                System.out.print("1   ");
            }
            System.out.println();
        }
    }
}