public class exception3{
    public static void main(String[] args) {
        System.out.println("throw keyword-custom exception");
        int age = 14;
        try{
        if(age % 2 == 0){
            throw new ArithmeticException("Age is too less");
        } else{
            throw new ArrayIndexOutOfBoundsException("array index out of bounds");

        }
    } catch(ArithmeticException e){
        System.out.println(e.getMessage());
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
    }
}