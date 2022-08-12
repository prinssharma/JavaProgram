import java.util.*;
public class CompressionOfString {

    public static String compression1(String s)
    {
        String str = s.charAt(0) + "";
        for(int i = 1; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            char prv = s.charAt(i - 1);
            if(curr != prv)
            {
                str += curr;
            }
        }
        return str;
    }
    public static String compression2(String s)
    {
        String str = s.charAt(0) + "";
        int count = 1;
        for(int i = 1; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            char prv = s.charAt(i - 1);
            if(curr == prv)
            {
                count++;
            }
            else{
                if(count > 1)
                {
                    str += count;
                    count = 1;
                }
                str += curr;
            }
            
        }
        if(count > 1)
                {
                    str += count;
                    count = 1;
                }
        return str;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String");
            String S = sc.next();
            System.out.println("first compression is : "+compression1(S));
            System.out.println("Second compression is : "+compression2(S));
        }


    }
}
