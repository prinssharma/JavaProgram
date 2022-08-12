import java.util.Stack;
public class AllAboutStack 
{
    public static void main(String[] args) 
    {
        Stack <Integer> st = new Stack<>();

        System.out.println("Element "+st+" , Size = "+st.size());
        st.push(8);

        System.out.println("Element "+st+ " , peek element = "+st.peek()+" , Size = "+st.size());
        st.push(10);
        st.add(21);
        st.push(20);

        System.out.println("Element "+st+ " , peek element = "+st.peek()+" , Size = "+st.size());
        st.push(33);
        st.push(21);

        System.out.println("Element "+st+ " , peek element = "+st.peek()+" , Size = "+st.size());
        st.pop();
        System.out.println("Element "+st+ " , peek element = "+st.peek()+" , Size = "+st.size());
    }
}
