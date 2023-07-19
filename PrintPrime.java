import java.util.Scanner;

public class PrintPrime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PrintPrime obj = new PrintPrime();
        int num = s.nextInt();
       
        for(int i=2; i<=num; i++){
            boolean result = obj.isPrime(i);
            if(result){
                System.out.print(" "+i);
            }
        }

    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
