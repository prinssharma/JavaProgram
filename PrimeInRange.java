import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the low and high range for prime");
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println("Prime number between "+low+" and "+high +" are");
        for(int i = low; i<=high; i++)
        {
            int count = 0;
            for(int j=2; j<=i/2; j++)
            {
                if(i % j ==0)
                {
                    count++;
                }
            }
            if(count == 0)
            {
                System.out.print(" "+i);
            }
           
        }
        System.out.println();

    }
}
