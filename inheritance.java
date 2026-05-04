class pet{ //parent class //common things of all pets
    String name;
    int age;
    void eat(){
        System.out.println("eating");
    }
}
//basic syntax
//class childclass extends parentclass
class Dog extends pet{ //child class //unique things
    void bark(){
        System.out.println("barking");
    }

}

public class inheritance {
   public static void main(String[] args) {
    Dog d = new Dog(); //creating object of child class
    //child class object has access to his properties/methods and also parent class properties/methods
    d.name = "Buddy";
    d.age = 3;
    System.out.println("Name: " + d.name);
    System.out.println("Age: " + d.age);
    d.eat(); //calling parent class method
    d.bark(); //calling child class method
   } 
}
