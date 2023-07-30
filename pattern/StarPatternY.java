import java.util.Scanner;

// Not completed
public class StarPatternY {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for star pattern");
        int n = sc.nextInt();

        System.out.println("Star pattern of given input");
        int mid = n/2;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j == n-1 || i==j && j<mid){
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
