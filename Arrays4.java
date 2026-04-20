class Student{
     String name;
     int rollno;
//construtor
  Student(String name, int rollno){
    this.name=name;
    this.rollno=rollno;
  }
  void display(){
   System.out.println(name + " " + rollno);
  }
}
public class Arrays4{
   public static void main(String[] args) {
    Student[] arr= new Student[3]; //aray of objects
     arr[0] = new Student("john", 1);
     
        arr[1] = new Student("Alice", 2);
        
        arr[2] = new Student("Bob", 3);
        
        for(Student var : arr){
          var.display();
        }
        
   }
}