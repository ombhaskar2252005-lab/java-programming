//1. inheritence is needed
class Parent{
    int age = 10;
    String name = "hello";
    Parent(int x){
        System.out.println("parent class constructor with value: " + x);
    }
    void show(){
        System.out.println("parent class method");
    }
    void print(int x){
        System.out.println("value of x = " + x);
    }
}
class Child extends Parent{
    Child(){
        //automatically inserted by java
        //if we have parameterized constructor in parent class then we have to call it explicitly using super keyword
        super(10); // imaginary object of Parent class and calling the constructor of parent class
        System.out.println("Child class constructor");
    }
    void show(){
        System.out.println("child class method");
    }
    void print(int x){
        System.out.println("double of x = " + (2 * x));
    }
    void parentfunction(){
        super.show();
        super.print(30);
    }
    void displayparent(){
        System.out.println(super.age);
        System.out.println(super.name);
    }

}
public class Override{
    public static void main(String[] args) {
        System.out.println("method overriding");
        Child c = new Child();
        c.show();
        c.print(10);
        c.parentfunction();
        c.displayparent();
    }
}