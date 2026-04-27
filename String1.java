import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {

        //1.creation
        String s1 = "hello";
        String s2 = new String(" world");
        System.out.println(s1);
        System.out.println(s2);
        //2.comparison - returns boolean value
        System.out.println(s1.equals(s2));
        //question check admin
        //3.methods
        //length
        System.out.println(s1.length());
        //toUpperCase
        System.out.println(s1.toUpperCase());
        //toLowerCase
        System.out.println(s1.toLowerCase());
        //charAt
        System.out.println(s1.charAt(2));
        //concat
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        // print individual characters of a string
        String name = "hlo bro";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        //5. Mutable string
        StringBuilder sb = new StringBuilder("hello ");
        //StringBuffer sb = new StringBuffer("hello");
        //6.append - add at last- returns a stringbuilder
       // sb.append(" java");
       // System.out.println(sb);
        //7.insert - jo index number doge wohi pe add kr dega
        sb.insert(2, "java");
        System.out.println(sb);
        //8.delete - index number ke beech me delete kr dega
        //end index is not considered
        sb.delete(2, 5);
        System.out.println(sb);
        //9.replace - index number ke beech me replace kr dega
        sb.replace(2, 6, "world");
        System.out.println(sb);
        
        //10.reverse
        System.out.println(sb.reverse());

        //q. take input from user as a string 
        // convert it to stringbuilder and reverse it
        // then return your answer as a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(input);
        sb1.reverse();
        String ans = sb1.toString();
        System.out.println("Reversed string: " + ans);
        
    }
}