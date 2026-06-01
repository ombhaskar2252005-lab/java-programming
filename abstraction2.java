abstract class Animal{
    abstract void eat();

}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat is eating");
    }
}
public class abstraction2 {
    public static void main(String[] args){
        Animal a1 = new Dog();
        a1.eat();
        Animal a2 = new Cat();
        a2.eat();

    }
}
