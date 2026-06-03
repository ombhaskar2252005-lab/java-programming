interface Person{
    abstract void print();
    //everything in an interface is public by default
    //1. methods are automatically abstract
    void show();
    //2. variables are automatically  static and final by default
    int age = 10;
    static final String name = "John";
    //3. no constructor
}
class Student implements Person{
    public void print(){
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }
    public void show(){
        System.out.println("Student show method");
    }

}

public class Abstraction3{
    public static void main(String[] args){
        System.out.println("Interface");
        Student s = new Student();
        s.print();
        s.show();

    }
}