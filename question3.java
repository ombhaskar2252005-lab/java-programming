class Shape{
    private int length;
    private int breadth;

    void setShape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int getlength(){
        return length;
    }
    int getbreadth(){
        return breadth;
    }
}
class Rectangle extends Shape{
    void getArea(){
          int length = getlength();
          int breadth = getbreadth();

          int area = length*breadth;
          System.out.println("area of rectangle is " + area);
    }
    
}
class Triangle extends Shape{
    void getArea(){
        int length = getlength();
        int breadth = getbreadth();
        double area = 0.5 * length * breadth;
        System.out.println("area of triangle is " + area);
    }
}
public class question3 {
    public static void main(String[] args) {
       Rectangle r = new Rectangle();
       r.setShape(6, 4);
       r.getArea();
       Triangle t = new Triangle();
       t.setShape(8, 6);
       t.getArea(); 
    }
}
