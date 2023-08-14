import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");

        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array element ");

        for(int i=0; i<s; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Given array : ");
        System.out.println(Arrays.toString(arr));
        MaxInArray obj = new MaxInArray();
        int max = obj.maximum(arr);
        System.out.println("Maximum in array is : "+max);

    }

    public int maximum(int[] arr){
        int h = arr.length;
        int max = arr[0];
        for(int i=1; i<h; i++){
            if(arr[i] > max){
                max  = arr[i];
            }
        }
        return max;
    
    }

}
