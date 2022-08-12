import java.util.Scanner;
import java.util.Stack;
public class BalancedBracket {
    public static boolean closingBracket(Stack<Character> s, char openchar)
    {
        if(s.size() == 0)
        return false;
        else if(s.peek() != openchar)
        return false;
        else{
            s.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a String");
            String st = sc.nextLine();
            System.out.println("Entered string is : "+st);

            Stack <Character> s = new Stack<>();
            for(int i = 0; i < st.length(); i++)
            {
                char ch = st.charAt(i);
                if(ch == '(' || ch == '[' || ch == '{')
                {
                  s.push(ch);
                }
                else if(ch == ')')
                {
                    boolean val = closingBracket(s, '(');
                    if (val == false){
                        System.out.println("Not balanced");
                        return;
                    }
                }
                else if(ch == ']')
                {
                    boolean val = closingBracket(s, ']');
                    if (val == false){
                        System.out.println("Not balanced");
                        return;
                    }
                }
                else if(ch == '}')
                {
                    boolean val = closingBracket(s, '{');
                    if (val == false){
                        System.out.println("Not balanced");
                        return;
                    }
                }


            }
            if(s.size() == 0)
            {
                System.out.println("Balanced bracket");
            }
            else{
                System.out.println("Not balanced bracket");
            }


        }

        

    }
    
}
