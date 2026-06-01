abstract class Shape{
    double length;
    double breadth;
    abstract double area();
}
class Circle extends Shape{
    double area(){
        return 3.14 * length * breadth;
    }
 } 
 class Rectangle extends Shape{
    double area(){
        return length * breadth;
    }
 }

public class abstractq2 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.length = 5;
        c.breadth = 5;
        System.out.println("Area of circle: " + c.area());
        Rectangle r = new Rectangle();
        r.length = 4;
        r.breadth =6;
        System.out.println("Area of rectangle: " + r.area());
    }
    
}
