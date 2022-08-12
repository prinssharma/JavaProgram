import java.util.*;
public class InverseOfArray {
    public static int[] inverse(int arr[])
    {
        int rev[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            int val = arr[i];
            rev[val] = i;
        }
        return rev;
        
    }
    public static void display(int arr[])
    {
        System.out.println("Inverse of given array is : ");
        for(int val : arr)
        {
            System.out.print(val + "  ");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int n =  sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter array element");
            for(int i=0; i< arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Entered array is : ");
            display(arr);
            System.out.println();
            int rev[] = inverse(arr);
      System.out.println();
      display(rev);
        }

        System.out.println();
    }

}
