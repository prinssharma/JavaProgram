import java.util.*;
public class DigitOfNumber {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number");
           int n = sc.nextInt(),q=0;
           int node=0, temp=n;
           while(temp!=0)
           {
            temp = temp / 10;
            node++;
           }
           int div = (int)Math.pow(10,node-1);
           System.out.println("The digits in the number are : ");
           while( div!=0 )
           {
              q = n/div;
              System.out.print(" "+q);
              n = n % div;
             div = div/10;
           }
           System.out.println();
        }
}
