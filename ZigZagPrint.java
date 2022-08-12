import java.util.Scanner;
public class ZigZagPrint {
    public static void zigZag(int n)
    {
        if(n == 0)
        return;
        System.out.print(n+" ");
        zigZag(n-1);
        System.out.print(n+" ");
        zigZag(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            System.out.println("Zig Zag print for "+n+ " is : ");
            zigZag(n);
        }

        System.out.println();

    }
}
