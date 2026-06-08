public class Upi implements PaymentProcessor{
    private final int mobileNumber;
    private final Paytm paytm;
    Upi(int mobileNumber){
        this.mobileNumber=mobileNumber;
        this.paytm=new Paytm();
    }
    @Override
    public void pay(int amount) {
        // other call
        paytm.proceed(mobileNumber, amount);
        
    }
}
