import java.util.*;
public class IncreasingNumber {
    public static void Increasing(int n)
    {
        if(n == 0)
        return;
        Increasing(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            System.out.println("Increasing number till "+n+" is : ");
            System.out.println();
            Increasing(n);
        }
    }
}
