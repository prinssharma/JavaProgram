import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n for prime number");
       int n = sc.nextInt();
       System.out.println("The prime numbers are : ");
       for(int i=1; i<=n; i++)
       {
           int count =0;
           for(int j=2; j<=i; j++)
           {
               if(i % j==0)
               {
                   count ++;
               }
           }
           if(count == 1)
           System.out.print(" "+i);
       }
       System.out.println();
    }
}