public class Card implements PaymentProcessor{
    private final long cardNumber;
    private final RazorPay razorPay;
    Card(long cardNumber){
        this.cardNumber=cardNumber;
        this.razorPay=new RazorPay();
    }
    @Override
    public void pay(int amount) {
        razorPay.proceed(cardNumber, amount);
    }
}
