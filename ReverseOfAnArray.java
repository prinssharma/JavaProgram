import java.util.*;
public class ReverseOfAnArray {
    public static void rev(int arr[])
    {
        int x = arr.length;
        int b[] = new int[x];
        System.out.println("The reverse of given array is : ");
      for(int i = x-1 , j = 0;i >= 0; i--, j++)
      {
        b[j] = arr[i];
        System.out.print("  "+b[j]);
      }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter size of array");
          int n =  sc.nextInt();
          int arr[] = new int[n];

          System.out.println("Enter array element");
          for(int i=0; i< arr.length; i++)
          {
              arr[i] = sc.nextInt();
          }
          System.out.println("Entered array element : ");
          for(int i=0; i< arr.length; i++)
          {
              System.out.print("  "+arr[i]);
          }
          System.out.println();
          rev(arr);
        }

        System.out.println();
    }

}
