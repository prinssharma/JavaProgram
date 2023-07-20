import java.util.Scanner;

class PrintFibonacci{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt(), prev, curr, next;

            if(n<1){
                System.out.println("Invalid input");
            }else if(n==1){
                System.out.println("0");
            }
            else{
                prev = 0;
                curr = 1;
               System.out.print(prev + " " + curr + " ");
                for(int i=2; i<n; i++){
                     next = prev + curr;
                    System.out.print(next+" ");

                    prev = curr;
                    curr = next;
                }

            }
        sc.close();
    }
}