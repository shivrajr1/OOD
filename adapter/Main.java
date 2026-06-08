public class Main {
    public static void main(String[] args) {
        PaymentProcessor card=new Card(1234567890123456L);
        PaymentProcessor upi=new Upi(1234567890);
        card.pay(100);
        upi.pay(50);
    }
}
