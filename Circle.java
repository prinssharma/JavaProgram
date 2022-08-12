import java.util.Scanner;
public class Circle {
    int x ;
    int y ;
    int r ;

    Circle(int x, int y, int r)
    {
     this.x = x;
     this.y = y;
     this.r = r;

    }
    public static float getArea(int r)
    {
        float area = (float)(Math.PI * r * r);

        return area;

    }
    public static float getPerimeter(int r)
    {
        float val =(float) (2 * Math.PI * r);
        return val;

    }
    public static boolean isInOrOut(int r, int x, int y, int p, int q)
    {
        float val = distanceBetweenCenterAndPoint(x,y,p,q);

        if(val <= r)
        return true;
        else
        return false;
    }
    public static float distanceBetweenCenterAndPoint(int x, int y, int p, int q)
    {
        float dist = (float)(Math.sqrt(Math.pow((x-p), 2) + Math.pow((y-q) , 2)));
        return dist;
    }
      public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the center (x,y) and radius r of circle");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();

            System.out.println("Enter the new point (p,q)");
            int p = sc.nextInt();
            int q = sc.nextInt();

            float area = getArea(r);
            float perimeter = getPerimeter(r);
            float dist = distanceBetweenCenterAndPoint(x, y, p, q);

            System.out.println("The Area of circle is = "+area+ " and Perimeter is = "+perimeter);
            System.out.println("Distance b/w center and point is = "+dist);

             boolean flag =  isInOrOut(r, x, y, p, q);
             System.out.println("Given new point is inside the circle is : " + flag);
        }
    
    }    
}
