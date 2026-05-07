class Vehicle{
    private String brand;
    void setBrand(String brand){
        this.brand = brand;

    }
    void getBrand(){
        System.out.println(brand);
    }
}
class Car extends Vehicle{
    private int speed;

    void setSpeed(int speed){
        this.speed = speed;
    }
    void getSpeed(){
        System.out.println(speed);
    }
}
class Bike extends Car{
    private double mileage;

    void setMileage(double mileage){
        this.mileage = mileage;
    }
    void getMileage(){
        System.out.println(mileage);
    }
}

public class question2AorB {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setBrand("TATA");
        b.setMileage(30.5);
        b.setSpeed(80);
        b.getBrand();
        b.getMileage();
        b.getSpeed();
    }
}
