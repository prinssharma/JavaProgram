

public class secondException {
    
    public static void main(String[] args) {
        
        try{
            System.out.println("1");
            int a = 100, b = 0, c;
            System.out.println("2");
            c = a / b;
            System.out.println("3");
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("4");
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println("5");
            System.out.println(e.getMessage());
        }
        System.out.println("Hello World");
    }
}
