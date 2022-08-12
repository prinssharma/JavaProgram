import java.util.*;
public class TwoDArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size in m x n ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int [10][10],i,j;
        System.out.println("Enter the array element");
        for(i=0; i<m; i++)
        {
            for(j=0;j<n;j++)
            {
            arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array elements are : ");
        for(i=0; i<m; i++)
        {
            for(j=0;j<n;j++)
            {
            System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
