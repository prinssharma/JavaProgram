import java.util.*;
public class SearchElementInArray {
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
            System.out.println("Enter element you want to search");
            int el = sc.nextInt();
            for(int i = 0; i < arr.length ; i++)
            {
                for(int j = 0; j < arr[0].length; j++)
                {
                    if(arr[i][j] == el)
                    {
                        System.out.println("Element found at position  i = "+i+" j = "+j);
                        return;
                    }
                    
                }
                
            }
        }

        System.out.println("Element not found");
    }
}
