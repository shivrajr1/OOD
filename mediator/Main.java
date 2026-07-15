public class Main {
    public static void main(String[] args) {
        Mediator mediator=new Mediator();
        User user1=new User("hello", mediator);
        User user2= new User("world", mediator);
        user1.send(user2, "123456789");
    }
}
