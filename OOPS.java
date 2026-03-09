 class Student {
    //data members or properties
    String name;
    int age;
    int attendance;
    void study(){ //methods or actions 
        System.out.println("studying"); //it is non static it is called by object
    }
}

public class OOPS {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "ayush";
        s1.age = 20;
        s1.attendance = 90;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.attendance);
        s1.study(); //methods called
    }
}
