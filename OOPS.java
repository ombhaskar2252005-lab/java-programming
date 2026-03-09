 class Student {
    //data members or properties
    String name;
    int age;
    int attendance;
    int marks = 87;
    void study(){ //methods or actions 
        System.out.println("studying"); //it is non static it is called by object and it is written inside the class
    }
    void display(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("marks is " + marks);
        System.out.println("attendance is "+attendance);
    }
}

public class OOPS {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "ayush";
        s1.age = 20;
        s1.attendance = 90;
        s1.marks = 87;
        s1.display(); //methods called
        s1.study(); //methods called
    }
}
