class Parent{
    private int a = 5;
    public int b = 10;
    protected int c = 15;
    int d = 8; //default access modifier

}
class Child extends Parent{
    void display(){
     //System.out.println(a); it show error because of the private it only run in same class
     System.out.println(b);
     System.out.println(c);
     System.out.println(d);
    }
}


public class AccessModifiers{
    public static void main(String[] args){
        System.out.println("access modifiers");
        Child c = new Child();
        c.display();
    }
}