package Stack;

public class Runner {
    public static void main(String[] args) {
        
        StackImpl st = new StackImpl();
        st.push(6);
        st.push(12);
        st.push(18);
        st.push(30);
        st.push(10);
        st.show();
        System.out.println("Popped element : "+st.pop());
        System.out.println("Peek element : "+st.peek());
        System.out.println("Popped element : "+st.pop());
        st.show();
        System.out.println("Peek element : "+st.peek());
        System.out.println("Popped element : "+st.pop());
        System.out.println("Peek element : "+st.peek());
        st.show();

    }
}
