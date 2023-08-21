interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


public class InterfacesAndAbstractClasses {
    public static void main(String[] args) {
        
        Circle circle = new Circle(); 
        circle.radius = 5.2; 
        double area = circle.calculateArea(); 
        System.out.println("Area of the circle: " + area);
    }
}

