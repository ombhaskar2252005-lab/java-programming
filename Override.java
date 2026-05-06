//1. inheritence is needed
class Parent{
    void show(){
        System.out.println("parent class method");
    }
    void print(int x){
        System.out.println("value of x = " + x);
    }
}
class Child extends Parent{
    void show(){
        System.out.println("child class method");
    }
    void print(int x){
        System.out.println("double of x = " + (2 * x));
    }
}
public class Override{
    public static void main(String[] args) {
        System.out.println("method overriding");
        Child c = new Child();
        c.show();
        c.print(10);
        Parent p = new Child();
        p.show();
    }
}