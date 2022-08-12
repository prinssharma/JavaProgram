import java.util.*;
public class SpanOfArray {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size");
            int n = sc.nextInt();
            int arr[] = new int [n];
            System.out.println("Enter array element : ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print("Entered array elements are :  ");
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(" "+arr[i]);
            }
            System.out.println();
            int max = arr[0];
            int min = arr[0];
            for(int i = 1; i < arr.length; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
            }
            for(int i = 1; i < arr.length; i++)
            {
                if (arr[i] < min)
                {
                    min = arr[i];
                }
            }
      int span = max - min;
      System.out.println("The span of array = "+span);
        }
        System.out.println();
    }
}
