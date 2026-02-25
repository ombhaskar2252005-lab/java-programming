import java.util.Scanner;

public class takingInput {
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("your age is: "+age);

        System.out.println("enter your salary: ");
        double salary = sc.nextDouble();
        int num = (int) salary;
        System.out.println("your salary is: "+num);
        sc.close();

    }
}