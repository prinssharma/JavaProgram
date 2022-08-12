import java.util.*;
public class GcdAndLcm {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter two number");
    int n1 = scn.nextInt();
    int n2 = scn.nextInt(),rem=0;
    int on1 = n1;
    int on2 = n2;
    while(n1 % n2 != 0)
    {
        rem = n1 % n2;
        n1= n2;
        n2 = rem;
        
    }
    int lcm = (on1 * on2)/n2;

System.out.println("Gcd of given number is : "+n2);
System.out.println("Lcm of given number is : "+lcm);
  }   
}
