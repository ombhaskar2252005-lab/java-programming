class BankAccount{
    String name;
    double balance;
    void setData(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    void invest(double rupees){
        this.balance = balance + rupees;
        System.out.println("investing current balance is " + this.balance);
    }
    void withdraw(double rupees){
        if(this.balance >= rupees){
            this.balance = balance - rupees;
            System.out.println("withdrawing current balance is " + this.balance);
        }
        else{
            System.out.println("Insufficient balance" );
        }
    }
    void displayBalance(){
        System.out.println("Account holder name: " + name);
        System.out.println("Current balance: " + balance);
    }
}
public class bank{
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank");
        BankAccount b1 = new BankAccount();
        b1.setData("Rahul", 5000.0);
        b1.displayBalance();
        b1.invest(2000.0);
        b1.withdraw(1000.0);
        b1.displayBalance();
    }
}
    