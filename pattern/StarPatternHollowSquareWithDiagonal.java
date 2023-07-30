import java.util.Scanner;

public class StarPatternHollowSquareWithDiagonal {
    
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for star pattern");
        int n = sc.nextInt();

        System.out.println("Star pattern of given input");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || j == 1 || j == n || i == n || i == j || i+j == n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            
            }
            System.out.println();
        }
        sc.close();

    }
}
