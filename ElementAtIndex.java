import java.util.*;
public class ElementAtIndex {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size");
            int n = sc.nextInt();
            int arr[] = new int [n];
            System.out.println("Enter array element : ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter a number you want to find");
            int a = sc.nextInt();
            int index = -1;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == a)
                {
                    index = i;
                    break;
                }
                
            }
            System.out.print("The element "+a+" at index = "+index);
        }
        System.out.println();
    }
}