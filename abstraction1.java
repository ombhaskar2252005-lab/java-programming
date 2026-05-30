abstract class Parent{
    String name;
    int age;

    abstract void print();
    void display(){
        System.out.println("parent class display function");
    }
    Parent(){
        System.out.println("parent class constructor");
    }

}
class Child extends Parent{
    // abstract method must be overridden in child class
    void print(){
        System.out.println("child class print function");
    }
    Child(){
        super(); // calls Parent constructor
        System.out.println("child class constructor");
    }
    

}
public class abstraction1 {
    public static void main(String[] args) {
        System.out.println("abstraction");

        // abstract class cannot be instantiated
        // Parent p = new Parent(); 
        // p.print();
        //upcasting - parent reference variable can refer to child object
        Parent p = new Child();
        p.print();
        p.display();
        Child c = new Child();
        c.print();
        c.display();
        //1. abstract method = no body [before curly brackets]
        //2. abstract method = abstract class - no object creation
        //3. abstract class have inheritance and method overriding
        //4. child class - must override the abstract method of parent class
        
    }
}
