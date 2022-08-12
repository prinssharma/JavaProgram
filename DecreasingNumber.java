import java.util.Scanner;
public class DecreasingNumber
{
    public static void Decreasing(int n)
    {
        if(n == 0)
        return;
        System.out.println(n);
        Decreasing(n-1);

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            System.out.println("Decreasing number from "+n+" is : ");
            System.out.println();
            Decreasing(n);
        }
    }
}