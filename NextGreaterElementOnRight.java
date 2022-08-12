import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class NextGreaterElementOnRight{
    public static void display(int a[])
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("Next Greater Element On Right is : ");
        for(int val : a)
        {
            sb.append(val+"\t");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array");

        int n = Integer.parseInt(br.readLine());
        int a[] = new int [n];

        System.out.println("Enter array element");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Entered array element is : ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        int nge[] = solve(a);
        display(nge);

    }
    public static int[] solve(int[] arr)
    {
        int nge[] = new int [arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]);
        nge[arr.length -1] = -1;

        for(int i = arr.length - 2; i >= 0; i--)
        {
            while(st.size() > 0 && arr[i] >= st.peek())
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }

            st.push(arr[i]);
            
        }
        return nge;
        
    }
}