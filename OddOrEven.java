import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();

            if(num % 2 == 0){
                System.out.println("number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }
    }
    
}
