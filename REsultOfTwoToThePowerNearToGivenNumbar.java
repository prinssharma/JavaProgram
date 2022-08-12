import java.util.Scanner;

public class REsultOfTwoToThePowerNearToGivenNumbar {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int val = 0, i = 1;
            while(true)
            {
                val = (int)Math.pow(2 , i);
                if(val <= n)
                {
                    i++;
                }
                else if (val > n)
                {
                    i--;
                    val = (int)Math.pow(2 , i);
                    System.out.println("req value = "+val);
                    break;
                }
            }
        }
       
    }
}
