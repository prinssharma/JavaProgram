import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllPrime {
    public static boolean isPrime(int n)
    {
        for(int div = 2; div * div <= n; div++)
        {
            if(n % div == 0)
            return false;
        }
        return true;
    }
    public static void solution(ArrayList<Integer> l1)
    {
        
        for(int i = l1.size()-1; i >= 0; i--)
        {
            int val = l1.get(i);
            if(isPrime(val) == true)
            {
                l1.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter ArrayList size");
            int n = sc.nextInt();

            ArrayList <Integer> list = new ArrayList<>();
            System.out.println("Enter data");
            for(int i = 0; i < n; i++)
            {
                list.add(sc.nextInt());
            }
            solution(list);
            System.out.println("After removing all prime list is : "+ list);
        }
    }
}
