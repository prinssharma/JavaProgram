import java.util.*;
public class SpiralTraversal {
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

            int tne = m * n;
            int count = 0;

            int minr = 0;
            int minc = 0;

            int maxr = arr.length - 1;
            int maxc = arr[0].length - 1;

            System.out.println("Spiral traversal of given matrix is : ");
            while(count < tne)
            {
                //left wall
                for(int i = minr, j = minc ; i <= maxr && count < tne; i++)
                {
                    System.out.println(arr[i][j]);
                    count++;
                }
                minc++;

                //bottem wall
                for(int i = maxr, j = minc ; j <= maxc && count < tne; j++)
                {
                    System.out.println(arr[i][j]);
                    count++;
                }
                maxr--;

                //right wall
                for(int i = maxr, j = maxc ; i >= minr && count < tne; i--)
                {
                    System.out.println(arr[i][j]);
                    count++;
                }
                maxc--;

                //top wall
                for(int i = minr, j = maxc ; j >= minc && count < tne; j--)
                {
                    System.out.println(arr[i][j]);
                    count++;
                }
                minr++;

            }
        }
    }
}
