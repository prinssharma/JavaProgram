import java.util.*;


public class SubsetOfAnArray {
   
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

      int limit = (int)Math.pow(2 , arr.length);

      System.out.println("Requried Subsets are : ");
      for(int i = 0; i < limit; i++)
      {
            String subset = " ";
            int temp = i;
            for(int j = arr.length - 1 ; j >= 0; j--)
            {
             int r  = temp % 2;
                temp = temp / 2;
              if(r == 0)
              {
                  subset = "-\t" + subset;
              }
              else{
                  subset = arr[j] + "\t" + subset;
              }
            }
            System.out.println(subset);
      }
        }
        System.out.println();
        
    }
}
