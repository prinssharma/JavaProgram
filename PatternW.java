import java.util.*;

                                                             
public class PatternW                                                 
{                                                                              
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");             
        int n = sc.nextInt();                                                                                                           
        System.out.println("The Pattern for "+n+" rows is : ");              
        for(int i=1; i<=n; i++)                                             
        {      
            for(int j=1; j <= n; j++)
            {
               if(j==1 || j==n)
               {
                System.out.print("*\t");
               }
               else if(i >= n/2+1 && (i == j || i + j == n+1))
               {
                System.out.print("*\t");
               }
               else{
                System.out.print("\t");
               }
            }
            System.out.println();
        }
    }
        
}
