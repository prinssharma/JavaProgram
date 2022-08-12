import java.util.*;
public class InvertedBarChart {
   
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
            int max = arr[0];
            for(int i = 1; i < arr.length; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }
            System.out.println("max = "+max);
            System.out.println("Requried Inverted BarChart is : ");
            
            for(int floor = 1; floor <= max; floor++)
            {
               for(int i = 0; i < n; i++)
               {
                if(arr[i] < floor)
                {
                System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }
               }
               System.out.println();
            }
        }
    }
}