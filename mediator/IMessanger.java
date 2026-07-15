public interface IMessanger {
    public void send(User form, User to, String message);
    public void sendToAll(User from, String message);
}
