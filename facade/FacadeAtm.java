public class FacadeAtm {
    private AccountService accountService;
    private PinService pinService;
    private Notification notification;
    FacadeAtm(){
        this.accountService=new AccountService();
        this.pinService=new PinService();
        this.notification=new Notification();
    }
    public void withdraw(int account, int pin, int amount){
        if(!accountService.isExist(account)){
            notification.notify("account does not exist.");
            return;
        }
        if(!pinService.isValid(account, pin)){
            notification.notify("enter valid pin");
            return;
        }
        if(!accountService.isAmount(amount)){
            notification.notify("insufficient balance");
            return;
        }
        accountService.setBalance(accountService.getBalance()-amount);
        notification.notify("you have withdraw amount : "+amount);
    }
}
