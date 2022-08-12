import java.util.*;
public class RotateBy90 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter order of Array in m x n form");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[][] = new int[m][n];

            System.out.println("Enter array elements");
            for(int i = 0; i < m ; i++)
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
            
            System.out.println("After rotation 90 degree matrix is : ");
            for(int i = 0; i < arr.length ; i++)
            {
                for(int j = arr[0].length-1; j >= 0; j--)
                {
                    System.out.print(arr[j][i]+"\t");
                }
                System.out.println();
            }
        }


    }
}
