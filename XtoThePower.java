import java.util.Scanner;
public class XtoThePower {
    public static int xToPower(int x, int n)
    {
        if (n == 0)
        return 1;
        int xnm1 = xToPower(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of x and n ");
            int x = sc.nextInt();
            int n = sc.nextInt();
            int val = xToPower(x, n);
            System.out.println(x+" to the power "+n+ " is = "+val);
        }

    }
}
