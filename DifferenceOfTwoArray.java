import java.util.*;
public class DifferenceOfTwoArray {
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

            int diff[] = new int[n2];

            int i = a.length - 1;
            int j = b.length - 1;
            int k = diff.length - 1;
            int c = 0;
            while (k >= 0)
            {
                int d = 0;
                int av = i >= 0 ? a[i] : 0;
                if(b[j] +c >= av)
                {
                    d = b[j] + c - av;
                    c = 0;
                }
                else
                {
                    d = b[j] + c + 10 - av;
                    c = -1;
                }
                

                diff[k] = d;
                i--; j--; k--;

            }
            int idx = 0;
            while(idx < diff.length)
            {
                if(diff[idx] == 0)
                {
                    idx++;
                }
                else{
                    break;
                }
            }
            System.out.println("The difference of two array is : ");
            while(idx < diff.length)
            {
                System.out.println(" "+diff[idx]);
                idx++;
            }
        }

        System.out.println();
    }
}
