class Notebook1{
    String name;
    int roll;
    //parameterized construcor 
    Notebook1(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
     
    //COPY CONSTRUCTOR
    Notebook1(Notebook1 obj){
     this.name = obj.name;
     this.roll = obj.roll;
    }
}
public class Notebook {
    public static void main(){
        System.out.println("Copy Constructor");
        Notebook1 n1 = new Notebook1("rahul", 101);
        Notebook1 n2 = new Notebook1(n1);
        System.out.println(n2.name);
        System.out.println(n2.roll);
    }
}
