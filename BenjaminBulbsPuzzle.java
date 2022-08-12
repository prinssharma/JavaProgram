import java.util.*;
public class BenjaminBulbsPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for Benjamin Bulb Solution");
        int n = sc.nextInt();
        System.out.print("The Banjamin Bulb will on which have the number : ");
        for(int i=1; i*i <= n; i++)
        {
            System.out.print(" "+ i*i);
        }
        System.out.println();
    }
}
