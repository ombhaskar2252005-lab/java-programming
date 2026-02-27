import java.util.Scanner;

public class areaofRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length = 0;
        double breadth = 0;
        double area = 0;
        System.out.println("Enter length of rectangle: ");
        length = sc.nextDouble();
        System.out.println("Enter width of rectangle: ");
        breadth = sc.nextDouble();
        area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
        sc.close();
    }
    
}
