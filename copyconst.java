class Copyconstructor{
    String name;
    int roll;
    //Parameterized constructor
    Copyconstructor(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    //copy constructor
    Copyconstructor(Copyconstructor obj){
        this.name = obj.name;
        this.roll = obj.roll;
    }
}
public class copyconst{
    public static void main(String[] args){
    System.out.println("copy constructor");
    Copyconstructor c1 = new Copyconstructor("om", 1);
    Copyconstructor c2 = new Copyconstructor(c1);
    System.out.println(c2.name);
    System.out.println(c2.roll);
    }
}