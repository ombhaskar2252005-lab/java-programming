class Encap{
    private int age;
//setter
    void setAge(int age ){
        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
     }
     //getter
     void getAge(){
        System.out.println(age);
     }
}
public class encapsulation{
    public static void main(String[] args){
     Encap e1 = new Encap();
     e1.setAge(34);
     e1.getAge();
    }
}