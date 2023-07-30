import java.util.Scanner;

// Right handed right-angled triangle
public class StarPattern4 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for star pattern");
        int n = sc.nextInt();

        System.out.println("Star pattern of given input");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j <= n){
                    System.out.print("    ");
                }
                else{
                    System.out.print("*   ");
                }
            
            }
            System.out.println();
        }
        sc.close();

    }
}
