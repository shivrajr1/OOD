public abstract class Bridge {
    protected Notification notification;
    Bridge(Notification notification){
        this.notification=notification;
    }
    public abstract void send();
}
