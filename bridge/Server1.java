public class Server1 extends Bridge{
    Server1(Notification notification){
        super(notification);
    }
    @Override
    public void send() {
        this.notification.send("server1");
    }
}
