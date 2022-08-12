import java.util.Scanner;

public class StringBuil {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
       

        StringBuilder s1 = new StringBuilder("Hello");

        char ch = s1.charAt(0);   //get
        System.out.println(ch);

        s1.setCharAt(0,'p');   // update
        System.out.println(s1);

        s1.append('g');
        System.out.println(s1);   // append

        System.out.println("Length of s1 = "+s1.length());  //length

        s1.insert(2, 'y');            //insert
        System.out.println(s1);

        s1.deleteCharAt(2);         //delete
        System.out.println(s1);

    }
}
