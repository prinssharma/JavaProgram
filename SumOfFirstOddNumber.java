import java.util.*;
public class SumOfFirstOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum += (2*i-1);
        }
        System.out.println("The sum = "+sum);
    }
}
