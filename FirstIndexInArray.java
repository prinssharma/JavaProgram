import java.util.Scanner;
public class FirstIndexInArray 
{
    public static int firstOccurence(int a[] , int index, int key)
    {
        if(index == a.length)
        return -1;

        if(a[index] == key)
        return index;
        else{
            int ans = firstOccurence(a, index + 1, key);
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

            int fi = firstOccurence(arr, 0, key);
            System.out.println("First index of "+key+" is = "+fi);
        }
    }
}
