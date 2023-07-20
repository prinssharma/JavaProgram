import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int res = 0;

        while(n>0){
            int r = n % 10;
            res = res * 10 + r;
            n /= 10;
        }
        System.out.println(res);
    }
}
