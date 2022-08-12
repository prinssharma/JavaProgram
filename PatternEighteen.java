import java.util.*;                                                             
public class PatternEighteen                                                   
{                                                                              
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");             
        int n = sc.nextInt();      
        int spc = 0;
        int st = n;                                                                                                      
        System.out.println("The Pattern for "+n+" rows is : ");              
        for(int i=1; i<=n; i++)                                             
        {      
            for(int j=1; j<= spc; j++)
            {
                System.out.print("\t");
                }
              
            for(int j=1; j<=st; j++)
            {
                if(i>1 && i<=n/2 && j>1 && j<st)
                {
                    System.out.print("\t");
                }
                else{
                System.out.print("*\t");
                }
            }    
             if(i <= n/2)
             {
               spc++;
               st-=2;
             }      
             else
             {
                spc--;
                st+=2;
             }                           
        
           
            System.out.println();
        }
    }
        
}
