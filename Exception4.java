class Destroy{
    protected void finalize(){
        System.out.println("object destroyer");
    }
}


public class Exception4 {
    public static void demo() throws ArithmeticException, ArrayIndexOutOfBoundsException{
        int choice = 3;
        if(choice % 2 == 0){
            throw new ArithmeticException("choice is zero");
        }
        else{
            throw new ArrayIndexOutOfBoundsException("choice is 1");
        }
    }
    public static void main(String[] args){
        try{
            demo();
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        Destroy d = new Destroy();
        d = null;
        System.gc();
    }
}
