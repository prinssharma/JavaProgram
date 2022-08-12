import java.util.*;
public class PatternSix                                                     
{                                                                             // pattern 
    public static void main(String[] args)                                    // *  *  *     *  *  *
    {                                                                         // *  *           *  *    
        Scanner sc = new Scanner(System.in);                                  // *                 *
        System.out.println("Enter value of n for number of row");             // *  *           *  *   
        int n = sc.nextInt();                                                 // *  *  *     *  *  * 
        int spc = 1;
        int st = n/2 +1;   
        System.out.println("The Pattern for "+n+" rows is : ");
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<=st; j++)
            {
                System.out.print("*\t");
            }
            for(int j=1; j<=spc; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++)
            {
                System.out.print("*\t");
            }
            if(i <= n/2)
            {
                st--;
                spc +=2 ;
            }
            else{
                
                st ++;
                spc-=2;
            }
            System.out.println();
        }
    }
}