import java.util.Scanner;
public class PalindromeSubset {
    public static void Solution(String str) {
        System.out.println("Palindrome substrings are : ");
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i + 1; j <= str.length(); j++)
            {
                if(isPalindrome(str.substring(i,j)))
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string");
            String s1 = sc.next();
            Solution(s1);

        }
    }
}
