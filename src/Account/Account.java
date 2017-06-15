package Account;

public class Account {
    private final String firstName;
    private final String lastName;
    //private final String userName;
    private  int balance;

    public Account(String firstName, String lastName, int balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    public int getBalance(){
        return balance;
    }
    public void depositBalance(int deposit){
        if (deposit > 0){
            this.balance += deposit;
            System.out.println("You deposited " + deposit + ". Your balance is now "+balance);
        }
    }
    public void withdrawBalance(int withdraw){
        if (withdraw > 0 && balance-withdraw >= 0){
            this.balance -= withdraw;
            System.out.println("You withdrawed " + withdraw + ". Your balance is now "+balance);
        }
    }
}
