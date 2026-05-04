class Dadaji{
    String surname;
    boolean isBalding;
    
    void relation(){
        System.out.println("i am dadaji");
    }
    class Papa extends Dadaji{
        int height;
        void relation2(){
            System.out.println("i am papa");
        }
    }
    class You extends Papa{
        void relation3(){
            System.out.println("i am you");
        }
    }

}
public class multilevelinheritance {
    public static void main(String[] args){
     System.out.println("Multilevel Inheritance");
     You Y = new You();
     Y.surname = "Sharma";
        Y.isBalding = true;
        Y.height = 5;
        Y.relation();
        Y.relation2();
        Y.relation3();
    }
}
