import java.util.*;
public class PatternFive                                                      
{                                                                             // pattern 
    public static void main(String[] args)                                    //       *
    {                                                                         //    *  *  *    
        Scanner sc = new Scanner(System.in);                                  // *  *  *  *  *
        System.out.println("Enter value of n for number of row");             //    *  *  *   
        int n = sc.nextInt();                                                 //       *   
        int spc = n/2;
        int st = 1;   
        System.out.println("The Pattern for "+n+" rows is : ");
        for(int i =1; i<=n; i++)
        {
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
                spc--;
                st +=2 ;
            }
            else{
                spc++;
                st -=2;
            }
            System.out.println();
        }
    }
}