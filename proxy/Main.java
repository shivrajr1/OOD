public class Main {
    public static void main(String[] args) {
        User admin=new User("admin", Role.Admin);
        User lana=new User("lana", Role.User);
        User denial=new User("denial", Role.User);
        Service proxy=new ProxyService(new DbService());
        proxy.getUser(lana, denial);
        proxy.getUser(admin, denial);
        proxy.deleteUser(lana, denial);
        proxy.deleteUser(admin, denial);
    }
}
