import java.util.*;
public class PrimeFactorOfNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for prime factor");
        int num = sc.nextInt();
        System.out.println("Prime factor of "+num+" is : ");
        for(int div = 2; div*div<=num; div++)
        {
            while(num % div ==0)
            {
                num = num / div;
                System.out.print(" "+div);

            }
            
        }
        if (num !=1)
        System.out.println(" "+num);
    }
}
