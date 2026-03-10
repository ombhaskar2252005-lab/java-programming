class Student {
    // data members or properties
    String name;
    int marks;
    int age;
    int attendance;

    void showResult() {
        if (marks > 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    void study() {
        System.out.println("studying");
    }
    // non static method - object ke through call karna padega
}

class Teacher {
    String name;
    int experience;
    double salary;
    boolean onLeave;

    void display() {
        System.out.println(name);
        System.out.println(experience);
        System.out.println(salary);
        System.out.println(onLeave);
    }
}

public class class1 {
    public static void main() {
        Student s1 = new Student();
        // classname objectname = new classname();
        System.out.println(s1.name);
        s1.name = "sanju";
        s1.age = 21;
        s1.attendance = 80;
        s1.marks = 89;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.attendance);

        s1.study();
        s1.showResult();

        Teacher hod = new Teacher();
        hod.name = "sir";
        hod.experience = 26;
        hod.salary = 100000;
        hod.onLeave = true;

        Teacher cohod = new Teacher();
        cohod.name = "co sir";
        cohod.experience = 20;
        cohod.salary = 80000;
        cohod.onLeave = false;

        hod.display();
        cohod.display();

    }
}