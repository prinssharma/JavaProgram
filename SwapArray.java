import java.util.Arrays;
import java.util.Scanner;

class SwapArray{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");

        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array element ");

        for(int i=0; i<s; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Given array : ");

        for(int i=0; i<s; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        SwapArray obj = new SwapArray();
        arr = obj.reverse(arr);
        System.out.print("Swapped array : ");
        System.out.print(Arrays.toString(arr));
    }

    public int[] swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return arr;
    }

    public int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

}