import java.util.*;
public class RotateDigit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n and digit k you want to rotate");
        int n = sc.nextInt();
        int k = sc.nextInt();
        //for number of digit count
        int temp = n;
        int count = 0;
        while(temp > 0)
        {
            temp = temp/10;
            count++;
        }
        k = k % count;
        if(k<0)
        {
            k = k+ count;
        }
        int div = 1;
        int multi = 1;
       for(int i=1; i<=count; i++)
       {
        if(i<=k)
          div = div * 10;
        else
          multi = multi * 10;
       }
       int q = n/div;
       int r = n%div;
        
        int rot = r * multi + q;
        System.out.println("The number "+n+" rotated by "+k+" digit is : "+rot);
    }
}
