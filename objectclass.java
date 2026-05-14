class Laptop{
    int price;
    String brand;

    public String toString() { //laptop class method run
        return "toString method called";
    }

    public boolean equals(Laptop that) { //that is the name of laptop object which we want to compare with this laptop object
        return (this.price == that.price);
    }
    public int hashCode() {
        return price; //returning price as hash code
    }
    //we cannot override getClass() method because it is final method in object class
    
}
public class objectclass{
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.price = 50000;
        obj1.brand = "Dell";
        Laptop obj2 = new Laptop();
        obj2.price = 50000;
        obj2.brand = "Dell";


        System.out.println(obj1);
        System.out.println(obj1.toString());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass().getName());
    }
}