import java.util.Scanner;
import java.util.Stack;
public class DuplicateBracket {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a String");
            String st = sc.nextLine();
            System.out.println("Entered string is : "+st);

            Stack <Character> s = new Stack<>();
            for(int i = 0; i < st.length(); i++)
            {
                char ch = st.charAt(i);
                if(ch == ')')
                {
                  if(s.peek() == '(')
                  {
                  System.out.println("Duplicate bracket present");
                  return;
                  }
                  else{
                    while( s.peek() != '(')
                    {
                        s.pop();
                    }
                    s.pop();
                  }
                }
                else
                {
                    s.push(ch);
                }
            }
        }

        System.out.println("No any duplicate bracket");

    }
    
}
