public class ControlFlow {
    public static void main(String[] args) {
        
        int num = 10;
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

    }
}
