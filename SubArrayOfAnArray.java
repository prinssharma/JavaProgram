import java.util.*;
public class SubArrayOfAnArray {
    
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
            
            System.out.println("Sub Array of Given array is : ");
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = i; j < arr.length; j++)
                {
                    for(int k = i; k <= j; k++)
                    {
                        System.out.print(arr[k]+"  ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println();
    }

}
