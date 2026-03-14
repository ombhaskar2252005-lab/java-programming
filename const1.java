class Constructor{
    double cgpa;
    int backlogs;
    boolean isPass;
    char grade;
    //parameterized constructor
    Constructor(double cg, int back){
        System.out.println("parameterized constructor");
        this.cgpa = cg;
        this.backlogs = back;
        if(cgpa >= 7.0 && backlogs == 2){
            isPass = true;
            grade = 'A';
        }
        else {
            isPass = false;
            grade = 'B';
        }
        
    }
    //values - object creation ke time pe pass karna
}


public class const1{
    public static void main(String[] args) {
        Constructor c1 = new Constructor(8.5, 2);
        System.out.println("CGPA: " + c1.cgpa);
        System.out.println("Backlogs: " + c1.backlogs);
        System.out.println("Pass: " + c1.isPass);
        System.out.println("Grade: " + c1.grade);
    }
}