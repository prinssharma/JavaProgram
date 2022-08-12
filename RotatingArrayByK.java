import java.util.*;
public class RotatingArrayByK {
    public static void reverse(int arr[], int i , int j)
    {
        int li = i;
        int ri = j;

        while(li < ri)
        {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }
    public static void display(int arr[])
    {
        System.out.println("The rotated array is : ");
      for(int val : arr)
      {
        System.out.print(val + " ");
      }
    }
    public static void rotate(int arr[], int k)
    {
        k = k % arr.length;
        if(k < 0)
        {
            k = k + arr.length;
        }

        reverse (arr, 0, arr.length - 1 - k);

        reverse (arr, arr.length - k, arr.length - 1);

        reverse (arr , 0 , arr.length - 1);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int n =  sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter array element");
            for(int i=0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Entered array element : ");
            for(int i=0; i < arr.length; i++)
            {
                System.out.print("  "+arr[i]);
            }
            System.out.println();
            System.out.println("Enter a value of k which you want to rotate");
            int k = sc.nextInt();
            rotate(arr, k);
      System.out.println();
      display(arr);
        }

        System.out.println();
    }

}
