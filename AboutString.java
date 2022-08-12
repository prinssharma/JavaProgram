import java.util.Scanner;

public class AboutString {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string");
            String s1 = sc.next();

            System.out.println("Entered string s1 is : "+s1);
            String s2 = sc.nextLine();

            System.out.println("Entered string s2 is : "+s2);
            System.out.println();

            System.out.println("Length of string s2 = "+s2.length());
            System.out.println();

            System.out.println("Char at index 2 = "+ s1.charAt(2));
            System.out.println();

            System.out.println("Char in the string s1 is : ");
            for(int i=0; i<s1.length(); i++)
            {
                System.out.print(s1.charAt(i)+"\t");
            }
            System.out.println();

            System.out.println("Substring of s1 is : ");
            for(int i = 0; i < s1.length(); i++)
            {
                for(int j = i + 1; j <= s1.length(); j++)
                {
                    System.out.println(s1.substring(i, j));
                }
            }
            System.out.println();
            String s3 = s1 + " " + s2;
            System.out.println("Addition of s1 and s2 is : "+s3);

            System.out.println();
            System.out.println("Splits of s2 is : ");
            String parts[] = s2.split(" ");
            for(int i = 0; i < parts.length; i++)
            {
                System.out.println(parts[i]);
            }
        }System.out.println();
    }
}
