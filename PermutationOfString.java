import java.util.*;
public class PermutationOfString {
    public static int factorial(int n)
    {
        int val = 1;
        for(int i = 2; i <= n; i++)
        {
            val = val * i;
        }
        return val;
    }
    public static void solution(String s)
    {
        int n = s.length();
        int f = factorial(n);
        System.out.println("Requried output is : ");
        for(int i = 0; i < f; i++)
        {
            StringBuilder sb = new StringBuilder(s);
            int temp = i;

            for(int div = n; div >= 1; div--)
            {
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string");
            String s = sc.next();
            solution(s);
        }
        
    }
}
