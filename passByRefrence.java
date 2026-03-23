class Ref{
    int a;
    //pass by object
    void change(Ref obj){
        obj.a = 30;
    }
}
public class passByRefrence {
    public static void main(String[] args) {
       System.out.println("pass by object");
       int a = 12;
       System.out.println(a);
       System.out.println("pass by object");
       Ref r1 = new Ref() ;
       r1.a = 12;
       System.out.println(r1.a);
       r1.change(r1);
       System.out.println(r1.a);
    }
}
