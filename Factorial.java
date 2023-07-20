import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int res = 1;
        for(int i=n; i>0; i--)
        {
            if(n == 0){
                System.out.println("1");
            }
            else{
                res *= i;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
