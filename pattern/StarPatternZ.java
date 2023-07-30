import java.util.Scanner;

public class StarPatternZ {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for star pattern");
        int n = sc.nextInt();

        System.out.println("Star pattern of given input");

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || i == n-1 || i+j == n-1){
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
