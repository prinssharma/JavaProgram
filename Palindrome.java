import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int num = sc.nextInt(),r=0,Rev=0;
       int temp = num;
       while(temp>0)
       {
         r = temp % 10;
         Rev = Rev*10 + r;
        temp = temp/10;
       }
       System.out.println("Reverse of given number : "+Rev);
       int sum=Rev;
       if(num==sum)
       System.out.println(num + " is a Palindrome");
       else 
       System.out.println(num + " is not a Palindrome");
    }
}
