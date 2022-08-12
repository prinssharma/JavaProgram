import java.util.Scanner;
public class OneDArray {
    public static void displayArray(int a[], int index)
    {
        if(index == a.length)
        return;
        System.out.print(a[index]+ "  ");
        displayArray(a, index + 1);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter array size");
            int n = sc.nextInt();

             int arr[] = new int [n];

            System.out.println("Enter array element");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }

            System.out.println("Entered array is : ");
            displayArray(arr,0);

            System.out.println();
        }
    }
    
}
