import java.util.*;
public class PatternTen
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for number of row");           // Pattern 
        int n = sc.nextInt();  
        int osp = n/2; 
        int insp = -1;
       
        System.out.println("The Pattern for "+n+" rows is : ");             //          1
        for(int i =1; i<=n; i++)                                            //       1     1
        {                                                                   //    1           1
            for(int j=1; j<=osp; j++)                                       //       1     1
            {                                                               //          1
                System.out.print("  ");
            }

            System.out.print(" *");

            for(int j =1; j<=insp; j++)
            {
                System.out.print("  ");
            }
            if(i>1 && i<n)
            {
            System.out.print(" *");
            }
                if(i <= n/2)
                {
                    osp --;
                    insp +=2;
                    
                }
                else{
                    osp++;
                    insp -=2;
                }
            System.out.println();
        }
    }
}
