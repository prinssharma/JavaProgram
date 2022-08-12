import java.util.Scanner;
public class DecreasingIncreasing {
    public static void DecInc(int n)
    {
        if(n == 0)
        return;
        System.out.println(n);
        DecInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            System.out.println("Requried output is : ");
            DecInc(n);
        }
    }
}
