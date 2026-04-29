 class Person{
    //static class Student{
// to create a static class we need a nested class where the inner class can only be static
   // }
static int count = 0;
Person(){
    count++;
}

}
public class staticQ{
    public static void main(String[] args) {
       Person p1 = new Person();
       Person p2 = new Person();
       Person p3 = new Person();
       System.out.println(Person.count); //we used class name for access static variable
    }
}