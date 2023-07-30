import java.util.Scanner;

// left right-angled triangle 
public class StarPattern3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for star pattern");
        int n = sc.nextInt();

        System.out.println("Star pattern of given input");

        for(int i=n; i>0; i--){
            for(int j=i; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();

    }
}
