import java.util.*;
public class PatternFour                                                      
{                                                                             // pattern 
    public static void main(String[] args)                                    // 1  1  1  1  1
    {                                                                         //    1  1  1  1
        Scanner sc = new Scanner(System.in);                                  //       1  1  1
        System.out.println("Enter value of n for number of row");             //          1  1
        int n = sc.nextInt();                                                 //             1
        System.out.println("The Pattern for "+n+" rows is : ");
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++)
            {
                System.out.print(" 1");
            }
            System.out.println();
        }
    }
}