public class AccountService {
    private int balance=10000;
    public boolean isExist(int accountNumber){
        return true;
    }
    public boolean isAmount(int amount){
        if(amount<=this.balance)return true;
        return false;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
}
