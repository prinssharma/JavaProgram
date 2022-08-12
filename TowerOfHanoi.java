import java.util.Scanner;
public class TowerOfHanoi {
    public static void toh(int n, int t1, int t2, int t3)
    {
        if(n == 0)
        return;
        toh(n-1, t1, t3, t2);
        System.out.println(n + "[ " + t1 + " -> " +t2+ " ]");
        toh(n-1, t3, t2, t1);
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n , t1 ,t2 and t3");
            int n = sc.nextInt();
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int t3 = sc.nextInt();
            System.out.println("Tower of Hanoi for given input is : ");
            toh(n , t1 , t2 , t3);
        }
    }
}
