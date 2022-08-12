import java.util.*;
public class SaddlePointOfArray {
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

            for(int i = 0; i < arr.length; i++)
            {
                int svj = 0;
                for(int j = 1; j < arr.length; j++)
                {
                    if(arr[i][svj] < arr[i][svj])
                    {
                        svj = j;
                    }
                }
                boolean flag = true;
                for(int k = 0; k < arr.length; k++)
                {
                    if(arr[k][svj] > arr[i][svj])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                {
                System.out.println("Saddle point is = "+arr[i][svj]);
                return;
                }      
                  
            }
        }

        System.out.println("no saddle point");
    }
}
