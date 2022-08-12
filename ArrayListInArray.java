import java.util.*;
public class ArrayListInArray {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> "+ list.size());
        list.add(10);                                           //Add
        list.add(20);
        list.add(30);
        System.out.println(list + " -> "+ list.size());

        list.add(1, 1000);                                  //Add  at any position
        System.out.println(list + " -> "+ list.size());

        int val = list.get(1);                              //get
        System.out.println("Value at position 1 = "+val);

        list.set(1, 2000);                                  //update
        System.out.println(list + " -> "+ list.size());

        list.remove(1);                                     //delete
        System.out.println(list + " -> "+ list.size());

        ArrayList<String> s = new ArrayList<>();
        
        s.add("Hello");
        s.add("Dello");
        s.add("cello");
        System.out.println(s + " -> "+ s.size());

        s.add(1, "yellow");
        System.out.println(s + " -> "+ s.size());

        for (int i = 0; i < s.size(); i++)
        {
            String S1 = s.get(i);
            System.out.println(S1);
        }

        for(int val1 : list)
        {
            System.out.println(val1);
        }

        System.out.println(list);
        System.out.println(s);
    }
}
