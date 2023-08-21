import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutput {
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, world!, I'm Prins Sharma a Student, Learner, Programmer, an Engineer.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

    }
}
