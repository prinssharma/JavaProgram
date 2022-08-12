import java.util.Scanner;

public class MaxElementInArray {
    public static int maxInArray(int a[], int idx)
    {
        if(idx == a.length)
        return 0;
        int max = maxInArray(a, idx + 1);
        
        if(max > a[idx])
        {
            return max;
        }
        else{
            return a[idx];
        }

    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int n = sc.nextInt();

            int a[] = new int[n];

            System.out.println("Enter array element ");
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }

             int max = maxInArray(a, 0);
             System.out.println("Maximum element in array is : "+ max);
        }
    }
}
