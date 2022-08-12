import java.util.*;
public class PythagoreanTripletOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number for check Pythagorean Triplet");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(b >= max)
           max = b;
        if (c >= max)
           max = c;
        
        if(max == a)
        {
            boolean flag = ((b*b)+(c*c) == (a*a));
            System.out.println("Given numbers are "+flag+" for Pythagorean Triplet");
        }
        else if(max == b)
        {
            boolean flag = ((a*a)+(c*c) == (b*b));
            System.out.println("Given numbers are "+flag+" for Pythagorean Triplet");
        }
        else
        {
            boolean flag = ((b*b)+(a*a) == (c*c));
            System.out.println("Given numbers are "+flag+" for Pythagorean Triplet");
        }

    }
}