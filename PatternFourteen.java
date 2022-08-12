import java.util.*;
public class PatternFourteen
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for table");           
        int n = sc.nextInt(), multi=0; 
        System.out.println("Table of "+n+" is : ");                                         
        for(int i=1; i<=10; i++)
        {
            multi = n * i;
            System.out.println(n+" x "+i +" = " +multi);
        }
    }
}