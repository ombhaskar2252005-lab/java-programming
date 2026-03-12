class Car{
    String brand;
    int speed;
    int price;
    void setproperties(String brand, int speed, int price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
    void accelerate(int speed){
        this.speed = this.speed + speed;
        System.out.println("accelerating... current speed is " + this.speed + " km/h");
    }
    void brake(int speed){
        this.speed = this.speed - speed;
        System.out.println("braking... current speed is " + this.speed + " km/h");
    }
    void display(){
        System.out.println("brand is "+brand);
        System.out.println("speed is "+speed + " km/h");
        System.out.println("price is "+price);
    }
} 
public class car_oops{
    public static void main(String[] args){
        System.out.println("Class Car");
        Car c1 = new Car();
        c1.setproperties("BMW", 220, 50000000);
        c1.display();
        c1.accelerate(30);
        c1.brake(50);
        
    }
}