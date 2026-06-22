public class Server2 extends Bridge{
    Server2(Notification notification){
        super(notification);
    }
    @Override
    public void send() {
        this.notification.send("server2");
    }
}
