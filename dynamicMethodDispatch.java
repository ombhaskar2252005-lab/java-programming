class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
    void eat(){
        System.out.println("dog eats");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat meows");
    }
    
}
public class dynamicMethodDispatch {
    public static void main(String[] args){
        Animal a = new Dog(); //upcasting
        //we have to convert a to dog(child)class to call eat method
        Dog d = (Dog) a; //downcasting
        a.sound(); 
        d.eat(); //limitation of upcasting - cannot call methods that are specific to the subclass

        Animal b = new Cat();
        b.sound(); //methods usi ka chalega jiska object hoga

    }
}
