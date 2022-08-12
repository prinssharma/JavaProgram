import java.util.*;
public class ExitPointOfMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter order of Array in m x n form");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[][] = new int[m][n];

            System.out.println("Enter array elements ( only 0 and 1 )");
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

            int dir = 0;
            int i = 0;
            int j = 0;

            while(true)
            {
                dir = (dir + arr[i][j]) % 4;

                if(dir == 0)
                {
                    j++;
                }
                else if(dir == 1)
                {
                    i++;
                }
                else if(dir == 2)
                {
                    j--;
                }
                else if(dir == 3)
                {
                    i--;
                }

                if(i < 0)
                {
                    i++;
                    break;
                }
                else if (j < 0)
                {
                    j++;
                    break;
                }
                else if(i == m)
                {
                    i--;
                    break;
                }
                else if(j == n)
                {
                    j--;
                    break;
                }


            }
            System.out.println("Exit point of matrix is :  i = "+i+" j = "+j);
        }
    }
}
