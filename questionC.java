   
class Circle{
    double radius;
    Circle(double radius){
       this.radius = radius;
    }
    void calArea(){
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class questionC {
    public static void main(String[] args){
        Circle c1 = new Circle(5.4);
        c1.calArea();
    }
}
