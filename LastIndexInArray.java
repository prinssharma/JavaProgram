import java.util.Scanner;
public class LastIndexInArray {
    
    public static int lastOccurence(int a[] , int index, int key)
    {
        if(index == a.length)
        {
        return -1;
        }
        int ans = lastOccurence(a, index + 1, key);
        if(ans == -1)
        {
            if(a[index] == key)
            {
            return index;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return ans;
        }
    }

    public static void displayArray(int a[], int index)
    {
        if(index == a.length)
        return;
        System.out.print(a[index]+ "  ");
        displayArray(a, index + 1);
        
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {

            System.out.println("Enter array size");
            int n = sc.nextInt();

             int arr[] = new int [n];

            System.out.println("Enter array element");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Entered array is : ");
            displayArray(arr, 0);

            System.out.println();
            System.out.println("Enter element you want to search");
            int key = sc.nextInt();

            int li = lastOccurence(arr, 0, key);
            System.out.println("Last index of "+key+" is = "+li);
        }
    }
}
