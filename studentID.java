import java.util.Scanner;

public class studentID {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name:");
      String name = sc.nextLine();
      System.out.println("Enter your roll number:");
      int roll = sc.nextInt();
      sc.nextLine(); // ye likhna pada kyunki nextInt ke baad nextLine ko call karna hota hai, otherwise nextLine skip ho jata hai
      System.out.println("Enter your email:");
      String email = sc.nextLine();
      System.out.println("Student name: " + name);
      System.out.println("Student roll number: " + roll);
      System.out.println("Student email: " + email);
      sc.close();
      
    }
    
}
