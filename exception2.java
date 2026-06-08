public class exception2{
    public static void main(String[] args) {
        try{
        int arr[] = {1,2,3};
        System.out.println(arr[5]); //dikkat1
        int i = 10/0; //dikkat2
        }
        
        catch(ArrayIndexOutOfBoundsException e){ //for dikkat 1
            //output me sirf yehi ayega kyuki pehle hmne array likha ha isliye 
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){ //for dikkat2
            System.out.println(e.getMessage());
        }
        catch(Exception e){ 
            //parent class of all exception, or isko end me likhna ha kyuki ye har exception ko catch kar lega, aur iske baad koi bhi catch block nahi chalega
            System.out.println("Something wrong");
        }

        //.getMessage() returns string ki dikkat kya arahi hai
    }
}