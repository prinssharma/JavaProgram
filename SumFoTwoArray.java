import java.util.*;
public class SumFoTwoArray {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first array size");
            int n1 = sc.nextInt();
            int a[] = new int[n1];
            
            System.out.println("Enter first array element : ");
            for(int i = 0; i < a.length; i++)
            {
                a[i] = sc.nextInt();
            }

            System.out.println("Enter second array size");
            int n2 = sc.nextInt();
            int b[] = new int[n2];

            System.out.println("Enter second array element : ");
            for(int i = 0; i < b.length; i++)
            {
                b[i] = sc.nextInt();
            }

            int sum[] = new int[n1 > n2 ? n1 : n2];
            int c = 0;

            int i = a.length - 1;
            int j = b.length - 1;
            int k = sum.length - 1;

            while (k >= 0)
            {
                int d = c;
                if(i >= 0)
                {
                    d += a[i];
                }
                if(j >= 0)
                {
                    d += b[j];
                }
                c = d / 10;
                d = d % 10;

                sum[k] = d;
                i--; j--; k--;

            }
            System.out.println("The sum of two array is : ");
            if ( c != 0)
            {
                System.out.print(" "+c);
            }
            for(int val : sum)
            {
                System.out.print(" "+val);
            }
        }

        System.out.println();
    }
}
