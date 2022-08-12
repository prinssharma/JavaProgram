import java.util.*;
public class BinarySearch {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size");
            int n = sc.nextInt();
            int arr[] = new int [n];

            System.out.println("Enter sorted array element : ");
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

            System.out.println("Enter the element you want to search");
            int ele = sc.nextInt();

            int low = 0;
            int high = arr.length - 1;

            while(low <= high)
            {
                int mid = (low + high) / 2;
                if(ele > arr[mid])
                {
                   low = mid + 1;
                }
                else if(ele < arr[mid])
                {
                   high = mid - 1;
                }
                else 
                {
                    System.out.println("Element found at index : "+mid);
                    return;
                }
                System.out.println();
            
            }
        }
        System.out.println("Element not found");
        
    }
}
