import java.util.*;
public class StringWithGap
{
    public static String solution(String s)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            
           char curr = s.charAt(i);
           char prev = s.charAt(i-1);
           int gap = curr - prev;

           sb.append(gap);
           sb.append(curr);
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string");
            String s1 = sc.next();

            System.out.println("Requried string = "+solution(s1));
        }
    }
}