class MethodOverloadng{
    //2 marks average
    int avg(int m1, int m2){
        int sum = m1+m2;
        int ans = sum/2;
        return ans;
    }
    int avg(double m1, double m2){
        double sum = m1+m2;
        double ans = sum / 2;
        return (int) ans;
    }
    //avg of 3 marks
    double avg(double m1, int m2, double m3){
        double sum = m1+m2+m3;
        double ans = sum / 3;
        return ans;
    }
    
}
public class overloading {
    public static void main(){
        System.out.println("Method overloading");
        MethodOverloadng o1 = new MethodOverloadng();
        // int var = o1.avg(10,20), first method called
       // double var = o1.avg(10.5 ,15 ,20.2); //second method called
       int var = o1.avg(12.3, 8.6);
        System.out.println(var);
    }
    
}
