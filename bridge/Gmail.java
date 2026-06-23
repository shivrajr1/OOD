public class Gmail implements Notification{
    @Override
    public void send(String message) {
        System.out.println("gmail by "+message);
    }
}
