import java.util.Scanner;

public class CountChar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = "Prins";
        // String s = sc.nextLine();
        // System.out.println(s);
        int count=0;
        // int len = s.length();
        // System.out.println(len);
        char ch;
        System.out.println(s.length());
        for(int i=0; i <= s.length()-1; i++){
            ch = s.charAt(i);
            count++;
        }
        System.out.println("total " + count);

    }
}
