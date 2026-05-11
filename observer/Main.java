
public class Main {
    public static void main(String[] args) {
        // System.out.println("sdfg sdfgh");
        User user1=new User("jaggi");
        User user2=new User("jagga");
        User user3=new User("kishan");
        UserManager manager=new UserManager();
        manager.addUser(user3);
        manager.addUser(user1);
        manager.addUser(user2);
        manager.notifyUsers("hello");
        manager.removeUser(user1);
        manager.notifyUsers("world");
    }
}
