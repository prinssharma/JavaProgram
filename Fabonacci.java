import java.util.*;
public class Fabonacci
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n for fabonacci series");
       int n = sc.nextInt(),a=0,b=1,sum =0;
       System.out.print("The fabonacci series is : ");
       for(int i=0; i<=n; i++)
       {
        System.out.print(" "+a);
           sum = a+b;
           a = b;
           b = sum;
       }
       
    }
}