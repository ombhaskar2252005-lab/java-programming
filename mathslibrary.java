import java.lang.Math;
public class mathslibrary{
public static void main(String[] args){
    //1.absolute -ve ko +ve and +ve ko no change
    System.out.println(Math.abs(-56));
    int abs = Math.abs(-89);
    System.out.println(abs);
   //2.square root
   System.out.println(Math.sqrt(9));
   int sqrt = (int) Math.sqrt(16);
   System.out.println(sqrt);
   //3.power;exponent -a to power b
   System.out.println(Math.pow(2,3));
   //4.maximum of 2 numbers, minimum of 2 numbers
   int max = Math.max(4,5);
   System.out.println(max);
   int min = Math.min(4,5);
   System.out.println(min);
   //5.round of, ceil,floor
   System.out.println(Math.round(2.3));
   System.out.println(Math.round(2.5));
   System.out.println(Math.ceil(2.1));
   System.out.println(Math.floor(2.9));
   //every method returns a value - you need to print or store in a variable
}
}