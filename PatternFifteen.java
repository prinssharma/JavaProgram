import java.util.*;
public class PatternFifteen
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for rows");           
        int n = sc.nextInt(), val = 1; 
        int st = 1;
        int spc = n/2;
        System.out.println("The requried output is : ");                                         
        for(int i=1; i<=n; i++)
        {
           
            for(int j =1; j<=spc; j++)
            {
               System.out.print("\t");
            }
            int cval = val;
            for(int j=1; j<=st; j++)
            {
                System.out.print("\t"+cval);
                if( j <= st/2)
            {
                cval++;
            }
            else{
                cval--;
            }
                
            }
            
            if(i <= n/2)
            {
                spc--;
                st += 2;
                val++;
            }
            else
            {
                spc++;
                st -=2;
                val--;
            }
            System.out.println();
        
        }
    }
}