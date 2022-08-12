import java.util.*;

public class CeilAndFloor {
   
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

            System.out.println("Enter an  element");
            int ele = sc.nextInt();

            int lo = 0;
            int hi = arr.length - 1;
            int ceil = 0;
            int floor = 0;
            while(lo <= hi)
            {
                int mid = (lo + hi) / 2;
                if(ele > arr[mid])
                {
                   lo = mid + 1;
                   floor = arr[mid];
                }
                else if(ele < arr[mid])
                {
                   hi = mid - 1;
                   ceil = arr[mid];
                }
                else 
                {
                    ceil = arr[mid];
                    floor = arr[mid];
                    break;
                }
                System.out.println();
            
            }
            System.out.println("Ceil value = "+ceil);
            System.out.println("Floor value = "+floor);
        }
        
    }
}
