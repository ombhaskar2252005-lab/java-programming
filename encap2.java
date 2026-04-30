class BankAccount{
    private int balance;
    void setBalance(int balance){
        if(balance>0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
        }
    }
    void getBalance(){
        System.out.println(balance);
    }
}
public class encap2 {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.setBalance(1000);
        ba.getBalance();
    }
}
