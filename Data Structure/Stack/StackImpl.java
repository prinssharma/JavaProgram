package Stack;

public class StackImpl {

    public void show(){
        for (int i : stack) {
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
    
    int[] stack = new int[5];
    int top = 0;
    public void push(int data){
        stack[top] = data;
        top++;
    }
    public int pop(){
        top--;
        int data;
        data = stack[top];
        stack[top] = 0;
        return data; 
    }

    public int peek(){
        int data;
        data = stack[top - 1];
        return data; 
    }
}
