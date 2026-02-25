public class nestedE {
    public static void main(){
        int age = 19;
        boolean hasvoterID = true;
        if (age>=18){
            if(hasvoterID){
                System.out.println("you can vote"); 
            } 
            else{
                System.out.println("get voter id");
            }
            }
        else{
            System.out.println("you cannot vote");
        }
    }
}
