import java.util.*;
public class ToggleCase
{
    public static String toggleCase(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                char lc = (char)(ch - 'A' + 'a') ;
                sb.setCharAt(i,lc);
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                char uc = (char)(ch - 'a' + 'A')  ;
                sb.setCharAt(i, uc);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string");
            String s1 = sc.nextLine();

            System.out.println("Toggle case of given string = "+toggleCase(s1));
        }
    }
}