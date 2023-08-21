import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndLists {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        System.out.println("Third number: " + numbers[2]);

        ArrayList<String> names = new ArrayList<>();
        names.add("PRINS");
        names.add("VIJETA");
        names.add("MAYANK");
        System.out.println(names);

        System.out.println("Name at the index 1 in the list is : "+names.get(1));

        for (String string : names) {
            System.out.println(string);

            System.out.println(Arrays.toString(string.toCharArray()));
        }
    }
}
