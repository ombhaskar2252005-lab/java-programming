class Mobile{
    String brand;
    int price;
    String battery;
    void android(){
        System.out.println("Android 15");
    }
}

public class oops1 {
    public static void main(String[] args){
     
      Mobile m1 = new Mobile();
      m1.brand = "Samsung";
      m1.price = 20000;
      m1.battery = "5000 mah";
      System.out.println("brand: " + m1.brand);
      System.out.println("price: " + m1.price);
      System.out.println("battery: " + m1.battery);
      m1.android();
    }
    
}
