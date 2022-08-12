import java.util.Scanner;
public class TransposeOfMatrix {
    public static void main(String[] args)
    {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter order of matrix in m x n");
        int m = var.nextInt();
        int n = var.nextInt();
        int a[][] = new int[20][20];
        System.out.println("Enter matrix element");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
               a[i][j] = var.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
               System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix is : ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
               System.out.print(" "+a[j][i]);
            }
            System.out.println();
        }
    }
}
