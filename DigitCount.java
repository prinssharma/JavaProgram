import java.util.*;
public class DigitCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int n = sc.nextInt();
       int count=0;
       while(n!=0)
       {
          n = n/10;
          count++;
       }
       System.out.println("Number of digits is : "+count);
    }

}
