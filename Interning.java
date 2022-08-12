import java.util.Scanner;

public class Interning {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string");
            String S1 = sc.next();
            System.out.println("Enter same string");
            String s2 = sc.next();
            System.out.println("Address of s1 = "+S1.hashCode()+ " and s2 = "+s2.hashCode());
            String s3 = new String("Hello");
            System.out.println("s3 = "+s3+ " Address of s3 = "+s3.hashCode());
            System.out.println(S1.equals(s2));
            System.out.println(S1.equals(s3));

            System.out.println("Length of S1 = "+S1.length()+" s2 = "+s2.length()+ " s3 = "+s3.length());

        }
    }
}
