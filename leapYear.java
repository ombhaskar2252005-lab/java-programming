public class leapYear {
    public static void main(){
        int year = 3000;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not a leap year");
                }
            }
            else{
                System.out.println("leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
