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
        Animal a = new Dog();
        a.sound(); 
        //a.eat(); //error because reference variable is of type animal and eat method is not present in animal class

        Animal b = new Cat();
        b.sound(); //methods usi ka chalega jiska object hoga

    }
}
