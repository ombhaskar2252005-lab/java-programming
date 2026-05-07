class Person{
    private String name;
    private int age;
    void set(int age, String name){
        this.age=age;
        this.name = name;

    }
     void get(){
        System.out.println("name "+ name);
        System.out.println("age " + age);
     }
}
class Student extends Person{
    int rollno;
    int marks;

    void setStudent(int rollno, int marks){
        this.rollno = rollno;
        this.marks = marks;
    }
    void display(){
        System.out.println("marks " + marks);
        System.out.println("rollno " + rollno);

    }
}
public class questiononline{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.set(23, "hello"); //parent
        s1.setStudent(200,189);//child
        s1.get();//parent
        s1.display();//child
    }
}