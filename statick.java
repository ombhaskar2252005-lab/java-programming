class Student{
    int erp;
    static String clgname= "RISU";
    //static keyword creates one shared among all objects of the class
    static void print(){
        System.out.println(clgname); //access static variable
        //we cannot access non-static variable erp here because static method belongs to the class and does not have access to instance variables
    }
}

public class statick {
    public static void main(String[] args){
     Student s1 = new Student();
     s1.erp = 123;
     System.out.println(s1.clgname);
     Student.print();
    }
    static{
        //it rruns at the start even before the main method is executed
        System.out.println("Static block executed");
    }
}
