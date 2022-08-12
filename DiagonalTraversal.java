import java.util.*;
public class DiagonalTraversal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter order of Array n");

            int n = sc.nextInt();
            int arr[][] = new int[n][n];

            System.out.println("Enter array elements");
            for(int i = 0; i < n ; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Entered array in matrix form is : ");
            for(int i = 0; i < arr.length ; i++)
            {
                for(int j = 0; j < arr[0].length; j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println(" Diagonal Traversal of matrix is : ");
            for(int g = 0; g < arr.length ; g++)
            {
                for(int i = 0, j = g; j < arr.length; i++, j++)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}
