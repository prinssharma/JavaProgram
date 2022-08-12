import java.util.*;
public class OneChar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a character");
       char c = sc.next().charAt(0);
       System.out.println("Entered character is : "+c);
       if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' || c=='O' || c=='U')
       System.out.println("Your entered character "+c+" is Vowel");
       else
       System.out.println("Your entered character " +c+ " is Consonent");
}
}

