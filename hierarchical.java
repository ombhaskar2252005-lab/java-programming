class Player{
    void play(){
        System.out.println("I am a player");

}
}
class Cricketer extends Player{
    void say(){
        System.out.println("i am a cricketer");
    }
}
class Batsman extends Cricketer{
   void bat(){
    System.out.println("i am a batsman");
   }
}
class Bowler extends Cricketer{
    void bowl(){
        System.out.println("i am a bowler");
    }
}

public class hierarchical {
    public static void main(String[] args){
        System.out.println("Hierarchical Inheritance");
        Batsman b = new Batsman();
        b.play();
        b.say();
        b.bat();
        Bowler bl = new Bowler();
        bl.play();
        bl.say();
        bl.bowl();
    }
}
