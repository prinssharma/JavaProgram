import java.util.Arrays;
import java.util.Scanner;

public class TwoArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter array1 element");
        for(int i=0; i<n; i++){
            arr1[i] =sc.nextInt();
        }
        System.out.println("Enter array2 element");
        for(int i=0; i<n; i++){
            arr2[i] =sc.nextInt();
        }
        sc.close();
        System.out.println("Array 1 : "+ Arrays.toString(arr1));
        System.out.println("Array 2 : "+ Arrays.toString(arr2));
        

        int sum = 0;
        for(int i = 0; i<arr1.length; i++){
            n = n-1;
            sum += arr1[i] * arr2[n];
        }
        System.out.print("Output = " + sum);
    }
}
