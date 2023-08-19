import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element : ");
        int key=sc.nextInt();
        System.out.println("Given array : "+ Arrays.toString(arr));

        for(int i=0; i<n; i++){
            if(n==0)
            {
                System.err.println("Invalid size");
            }
            else{
                if(arr[i] == key){
                    System.out.println("Element found at "+ i);
                    return;
                }
            }
        }
        System.out.println("Element not present in the array");
    }
}
