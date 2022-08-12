import java.util.*;
public class PatternSixteen
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");             
        int n = sc.nextInt();      
        int spc = 2*n-3;                                                     // Pattern
        int st = 1;                                                          // 1                 1
        System.out.println("The Pattern for "+n+" rows is : ");              // 1  2           2  1
        for(int i=1; i<=n; i++)                                              // 1  2  3     3  2  1
        {    int val = 1;                                                    // 1  2  3  4  3  2  1
            for(int j=1; j <= st; j++)                                       
            {
               System.out.print(val+"\t");
               val++;
            }
            for(int j=1; j<=spc; j++)
            {
                System.out.print("\t");
            }
            if(i == n)
            {
                st--;
                val--;
            }
            for(int j=1; j <= st; j++)                                       
            {
                val--;
               System.out.print(val+"\t");
            }
            st++;
            spc -= 2;
           
            System.out.println();
        }
    }
}