public class righttriangle {
    public static void main() {
        for(int r = 1; r<= 4; r++){
            for(int c = 1; c <= r; c++){
                System.out.print("* ");
            }
            System.out.println(" "); // Move to the next line after each row
        }
    }
    
}
