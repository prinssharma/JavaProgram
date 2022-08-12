import java.util.*;
public class ArraySum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr1[] = new int [10],i;
        int arr2[] = new int [10];
        int arr3[] = new int [10];
        System.out.println("Enter the first array element");
        for(i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the second array element");
        for(i=0; i<n; i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.print("The array elements sum are : ");
        for(i=0; i<n; i++)
        {
            arr3[i] = arr1[i] + arr2[i];
            System.out.print("  "+arr3[i]);
        }
        System.out.println();
    }
    
}
