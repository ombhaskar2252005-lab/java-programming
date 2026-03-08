public class methodsE {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static double areaofcircle(double r){
        double area = 3.14 * r * r;
        return area;
    }
    public static void checkEvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
    public static boolean checkevenodd(int num){ //boolean method
        if(num % 2 == 0){
            return true; //even
        } else {
            return false; //odd
        }
    }
    public static void main(String[] args) {
        greet("Anmol");
        int result = add(5, 10);
        System.out.println("The sum is: " + result);
        double circleArea = areaofcircle(5.2);
        System.out.println("The area of the circle is: " + circleArea);
        checkEvenOdd(7);
        boolean check = checkevenodd(8);
        if(check == true){
            System.out.println(8 + " is even.");
        } else{
            System.out.println(8 + " is odd.");
        }
    }
}
