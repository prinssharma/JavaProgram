import java.util.Arrays;
import java.util.Scanner;

public class EvenDigitsInArray {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");

        EvenDigitsInArray obj = new EvenDigitsInArray();

        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array element ");

        for(int i=0; i<s; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Given array : ");
        System.out.println(Arrays.toString(arr));

        int num = obj.findNumbers(arr);
        System.out.println("Total even digit number in array is : "+num);
        sc.close();
        
    }
    public int findNumbers(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int check = countDigit(num);
            if(check % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public int countDigit(int n){
        int flag = 0;
        while(n>0){
            flag++;
            n = n/10;
        }
        return flag;
    }
}
