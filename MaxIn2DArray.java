import java.util.Arrays;
import java.util.Scanner;

public class MaxIn2DArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter array element");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        MaxIn2DArray obj = new MaxIn2DArray();
        int max = obj.maxInArray(arr);
        int[] index = obj.indexOfMax(arr, max);
        System.out.println("Maximum element in Array is: "+max);
        System.out.println("At Index : "+ Arrays.toString(index));

        sc.close();
    }

    public int[] indexOfMax(int[][] arr, int max){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == max){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }

    public int maxInArray(int arr[][]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
