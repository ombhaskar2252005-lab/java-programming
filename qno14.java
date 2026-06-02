//14.online shopping
abstract class Product{
    abstract double getDiscount();
    
}
class Electronics extends Product{
    double getDiscount(){
        return 10.0;
    }

}
class Clothing extends Product{
    double getDiscount(){
        return 15.0;
    }

}
public class qno14 {
    public static void main(String[] args) {
        Electronics e = new Electronics();
        Clothing c = new Clothing();
        System.out.println(e.getDiscount());
        System.out.println(c.getDiscount());
    }
    
}
