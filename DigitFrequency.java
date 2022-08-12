import java.util.*;
public class DigitFrequency {
    public static void display(int n, int d, int frq)
    {
        System.out.println(d +" in "+ n + " = "+ frq +" times");
    }
    public static int count (int n, int d)
    {
        int val =0;
        while(n>0)
        {
        int r = n % 10;
        n = n/10;
        if(r == d)
        {
            val++;
        }
        }
        return val;
    }
    
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            System.out.println("enter the digit you want to search");
            int d = sc.nextInt();
            int freq = count(n,d);
            display(n, d, freq);
        }
    }
    
}
