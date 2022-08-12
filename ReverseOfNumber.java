import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int n = sc.nextInt(),r=0, rev=0;
       
       while(n>0)
       {
         r = n % 10;
         rev = rev*10 + r;
          n = n/10;
       }
       System.out.println("The reverse of given number : "+rev);
       
    }
}
