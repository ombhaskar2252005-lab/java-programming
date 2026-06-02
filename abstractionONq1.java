//13.transport fare calculator
abstract class Transport{
    abstract double calculateFare(int distance);
}
class Bus extends Transport{
    double calculateFare(int distance){
        return distance*2.5;
    }
}
class Train extends Transport{
    double calculateFare(int distance){
        return distance*1.5;
    }
}
public class abstractionONq1{
    public static void main(String[] args){
        Bus b = new Bus();
        Train t = new Train();
        System.out.println(b.calculateFare(25));
        System.out.println(t.calculateFare(25));
    }
}