public class exceptionHandling {
    public static void main(String[] args){
        int i = 10;
        int j = 1;
        // akela try block likhne se exception handle nahi hoga, uske sath catch ya finally block bhi hona chahiye
        try {
            int ans = i/j; //dikkat wala code
        }
        catch(Exception e){
            System.out.println("something wrong"); //dikkat aye toh kya krna hai
        }
        finally{
            System.out.println("finally block executed"); //runs everytime chahe galti ho ya na ho
        }
    }
}
