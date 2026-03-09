class Rectangle{
    int length;
    int breadth;
    void area(){
        System.out.println("Area of rectangle is "+ length*breadth);
    }
}

public class oopsRectangle {
   public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.length = 5;
    r1.breadth = 3;
    r1.area();
   }
}

