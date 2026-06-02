abstract class Doctor{
    abstract void treatPatient();
}
class Cardiologist extends Doctor{
    void treatPatient(){
        System.out.println("Treat heart disease");
    }
}
class Dermatologist extends Doctor{
    void treatPatient(){
        System.out.println("treat skin related disease");
    }
}
public class qno15 {
    public static void main(String[] args) {
        Cardiologist  cs = new Cardiologist();
        Dermatologist ds = new Dermatologist();
        cs.treatPatient();
        ds.treatPatient();
        
    }
}
