import java.util.*;
public class TwoDArraySum {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of first matrix in m x n ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int arr1[][] = new int [10][10],i,j;
        int arr2[][] = new int [10][10];
        int sum[][] = new int [10][10];
        System.out.println("Enter the matrix element");
        for(i=0; i<m; i++)
        {
            for(j=0;j<n;j++)
            {
            arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the order of second matrix in p x q ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        if(m==p && n==q)
    {
        System.out.println("Enter the matrix element");
        for(i=0; i<p; i++)
        {
            for(j=0;j<q;j++)
            {
            arr2[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("The sum of matrix is : ");
        for(i=0; i<m; i++)
        {
            for(j=0;j<n;j++)
            {
                sum[i][j] = arr1[i][j]+arr2[i][j];
            System.out.print("  "+sum[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    else
    {
    System.out.println("The sum of matrix not possible");
    }
}
}
