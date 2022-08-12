import java.util.*;
public class StringReverse {
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println("Entered string is : "+s);
        int l = s.length();
        String rev= " ";
        for(int i=l-1; i>=0; i--)
        {
            rev = rev +  s.charAt(i);
        }
        System.out.println("Reversed string is : "+rev);
    }
}