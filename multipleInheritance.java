interface Parent1{
    void method1();
    void display();
}

interface Parent2{
    void method2();
    void display();
}

class Child implements Parent1, Parent2{
    public void method1(){
        System.out.println("Method 1 from Parent 1");
    }
    public void method2(){
        System.out.println("Method 2 from Parent 2");
    }
    public void display(){
        System.out.println("Display method from both parents");
    }
}

public class multipleInheritance {
    public static void main(String[] args){
        System.out.println("Multiple Inheritance in Java");
        Child c = new Child();
        c.method1();
        c.method2();
        c.display(); 
    }
}
