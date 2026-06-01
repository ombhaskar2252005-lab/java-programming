abstract class Employee{
    String name;
    abstract void calculateSalary();

} 
class FullTimeEmployee extends Employee{
    
    void calculateSalary(){
        System.out.println(name);
        System.out.println("Full time employee salary is 50000");
    }
}
class PartTimeEmployee extends Employee{
    
    void calculateSalary(){
        System.out.println(name);
        System.out.println("Part time employee salary is 20000");
    }
}
public class abstractQ1 {
    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee(); //abstract class ka object nhi banta
        e1.name = "John Doe";
        e1.calculateSalary();
        Employee e2 = new PartTimeEmployee();
        e2.name = "yash";
        e2.calculateSalary();
    }
    
}
