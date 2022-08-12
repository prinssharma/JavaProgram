import java.util.*;
public class BiggerAmongThreeNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number for checking bigger among them");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int big=0, small=0;
        big = (a > b) ? ((a > c) ? a : c) : ((b > c) ?  b : c);
        small = (a < b) ? ((a < c) ? a : c) : ((b < c) ?  b : c);
        System.out.print("The bigger number is : "+big);
        System.out.println();
        System.out.println("The smaller number is : "+small);
        System.out.println();
    }
}
