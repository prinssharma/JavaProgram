import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int [20],i;
        System.out.println("Enter the array element");
        for(i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array elements are : ");
        for(i=0; i<n; i++)
        {
            System.out.print("  "+arr[i]);
        }
        System.out.println();
    }
}