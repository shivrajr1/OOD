public class User {

    private String name;
    private IMessanger messanger;

    User(String name, IMessanger messanger){
        this.name=name;
        this.messanger=messanger;
    }
    public void send(User to, String message){
        messanger.send(this, to, message);
    }
    public void sendToAll(String message){
        messanger.sendToAll(this, message);
    }
    public void receive(User from, String message){
        System.out.println(message+" -- from :- "+from.name);
    }
}
