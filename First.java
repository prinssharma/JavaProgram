import java.io.FileInputStream;


public class First{

    public static void main(String[] args) {

        System.out.println("1");
        
        try{
            System.out.println("2");
            FileInputStream fis = new FileInputStream("d:/abc.txt");
            System.out.println("3");
        }
        catch(Exception ae)
        {
            System.out.println("4");
            System.out.println(ae);
            System.out.println("5");
        }
        System.out.println("Hello java");
    }
}