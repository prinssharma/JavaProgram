import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter order of first Array in m x n ");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr1[][] = new int[m][n];

            System.out.println("Enter order of second Array in m x n ");
            int p = sc.nextInt();
            int q = sc.nextInt();
            int arr2[][] = new int[p][q];

            int res[][] = new int [m][q];

            if(n == p) 
            {

            System.out.println("Enter first array elements");
            for(int i = 0; i < m ; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter second array elements");
            for(int i = 0; i < p ; i++)
            {
                for(int j = 0; j < q; j++)
                {
                    arr2[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < m ; i++)
            {
                
                for(int j = 0; j < q; j++)
                {
                    for(int k = 0; k < n; k++)
                    {
                        res[i][j]  +=  arr1[i][k] * arr2[k][j];
                    }
                    
                }
            }

            System.out.println("Multiplication of matrix is : ");
             for(int i = 0; i < m; i++)
             {
                for(int j = 0; j < q; j++)
                {
                    System.out.print(res[i][j] + "  ");
                }
                System.out.println();
             }
            }
            else 
            {
            System.out.println("matrix multiplication not possible");
            }
        }
    }
}
