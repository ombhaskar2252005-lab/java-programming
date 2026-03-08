import java.util.Scanner;
public class userInput {
   static int square(int num){
    return num*num;
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    System.out.println(square(n));
    sc.close();
   }
}

