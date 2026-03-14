class CarS{
    String brand;
    int speed;
    int price;
    CarS(String brand, int speed, int price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
}


public class const2 {
    public static void main(String[] args){
    CarS c1 = new CarS("BMW", 200, 5000000);
    System.out.println("Brand: " + c1.brand);
    System.out.println("Speed: " + c1.speed);
    System.out.println("Price: " + c1.price);
    }
}
