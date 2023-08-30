package Tree;

import java.util.Stack;

public class ConstructBinaryTree {
    
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        int state;
        Node node;

        Pair(Node node , int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = "";
        str += node.left == null ? " . " : node.left.data + " ";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? " . " : node.right.data + " ";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public static void traversalPreInPost(Node node){
        Stack<Pair> st = new Stack<>();
        Pair rt = new Pair(node, 1);
        st.push(rt);

        String preOrder = "";
        String inOrder = "";
        String postOrder = "";

        while(st.size() > 0){
            Pair top = st.peek();

            if(top.state == 1){ // pre , st ++, left
                preOrder += top.node.data + " ";
                top.state++;
                if(top.node.left != null){
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }
                
            }
            else if(top.state == 2){ // In, st++, right
                inOrder += top.node.data +  " ";
                top.state++;
                if(top.node.right != null){
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }
                
            }
            else{ // post, pop
                postOrder += top.node.data +  " ";
                st.pop();
            }
        }
        System.out.print("Preorder : "+preOrder);
        System.out.println();
        System.out.print("Inorder : "+inOrder);
        System.out.println();
        System.out.print("Postorder : "+postOrder);
        
    }
    public static void main(String[] args) {
        
        Integer[] arr = {50, 25, 12, null, null,37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        // int[] arr1 = {50,25,12,37,75,62,18};
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                idx++;
                if(arr[idx] != null){
                    top.node.left= new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left,1);
                    st.push(lp);
                }
                else{
                    top.node.left = null;
                }
                top.state++;

            }else if(top.state == 2){

                idx++;
                if(arr[idx] != null){
                    top.node.right= new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right,1);
                    st.push(rp);
                }
                else{
                    top.node.right = null;
                }
                top.state++;

            }else{
                st.pop();
            }
        }

        display(root);
        traversalPreInPost(root);
    }


}
