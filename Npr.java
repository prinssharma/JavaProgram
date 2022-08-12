import java.util.*;
public class Npr {
    public static void display(int n, int r, int npr)
    {
        System.out.println(n +" p "+ r+ " = "+ npr);
    }
    public static int fact(int x)
    {
        int rv = 1;
        for(int i =1; i<=x; i++)
        {
            rv *= i; 
        }
        return rv;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n and r");
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n >= r)
            {
            int nfact = fact(n);
            int nmrfact = fact(n - r);
            int npr = nfact / nmrfact;
            display(n, r, npr);
            }
            else
            {
                System.out.println("npr not possible");
            }
        }
    }
}
