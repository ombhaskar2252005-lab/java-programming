class InvalidAgeException extends Exception{
    //parameterized constructor
    public InvalidAgeException(String message){
        //parent class ka constructor call - super();
        super(message);
    }
}
class InvalidSalaryException extends RuntimeException{
    public InvalidSalaryException (String message){
        super(message);
    }
}

public class CustomExceptionClass{
    public static void checkAge() throws InvalidAgeException{
        int age = 19;
        if (age<18) {
            throw new InvalidAgeException("age is too less to vote");
        }
    }

    public static void checkSalary() throws InvalidSalaryException{
        int salary = -90;
        if(salary <0){
            throw new InvalidSalaryException("salary cannot be negative");
        }
    }
    public static void main(String[] args) {
        System.out.println("custom exception class");
        try{
            checkAge();
            checkSalary();

        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());

        } catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
        
    }
}