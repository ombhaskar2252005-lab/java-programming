class person{
    private int age;
    //setter - using a parameterized constructor
    person(int age){
        this.age = age;
    }
    //getter
    void getAge(){
        System.out.println(age);
    }
}
public class immutableClass {
    public static void main(String[] args){
        person p1 = new person(67);
        p1.getAge();
        //agar value change krna ho toh naya object create krna parega kyuki class immutable hai
        person p2 = new person(43);
        p2.getAge();
    }
}
