import java.util.Scanner;
public class OneDArrayRev {
    public static void displayArrayRev(int a[], int index)
    {
        /*  if(index < 0)
        return;
        System.out.print(a[index]+ "  ");
        displayArrayRev(a, index - 1);          */
        if(index == a.length)
        return;
        displayArrayRev(a, index + 1);
        System.out.print(a[index]+ " ");
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

            System.out.println("Entered array in reverse is : ");
            displayArrayRev(arr,0);

            System.out.println();
        }
    }
    
}
