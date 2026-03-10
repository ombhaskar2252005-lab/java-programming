 class Student {
    //data members or properties
    String name;
    int age;
    int attendance;
    int marks ;
    void study(){ //methods or actions 
        System.out.println("studying"); //it is non static it is called by object and it is written inside the class
    }
    void setproperties(String name, int age, int attendance, int marks){
        this.name = name;
        this.age = age;
        this.attendance = attendance;
        this.marks = marks;
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
        s1.study(); //methods called
        s1.setproperties("ayush", 20, 90, 87);
        s1.display();
        Student s2 = new Student();
        s2.setproperties("sanju", 21, 80, 89);
        s2.display();
    }
}
