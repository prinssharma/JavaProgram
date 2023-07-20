import java.util.Scanner;

public class CheckArmstrong {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three digit number");
        int n = sc.nextInt(), res = 0;
        int originalNo = n;
        while(n>0){
            int r = n % 10;
            res = res + r*r*r;
            n /= 10;
        }
        if(res == originalNo){
            System.out.println(originalNo + " is an armstrong number");
        }
        else{
            System.out.println(originalNo + " is Not an armstrong number");
        }
        sc.close();
    }
}
