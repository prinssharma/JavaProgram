import java.util.*;
public class TwoDArrayMultiply {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of first matrix in m x n ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int arr1[][] = new int [10][10],i,j,k,sum=0;
        int arr2[][] = new int [10][10];
        int arr3[][] = new int [10][10];
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
        if(n==p)
    {
        System.out.println("Enter the matrix element");
        for(i=0; i<p; i++)
        {
            for(j=0;j<q;j++)
            {
            arr2[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<m; i++)
        {
            for(j=0;j<q;j++)
            {
                sum = 0;
                for(k=0;k<m;k++)
                {
                    sum += arr1[i][k]*arr2[k][j];
                }
                arr3[i][j] = sum;
            }
        }
    System.out.println("The multiplication of matrix is : ");
    for(i=0; i<m; i++)
    {
        for(j=0;j<q;j++)
        {
         System.out.print(" "+arr3[i][j]);
        }
        System.out.println();
    }
}
    else
    {
    System.out.println("The multiplication of matrix is not possible");
    }
}
}
