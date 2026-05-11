
class User implements Notification{
    public String name;
    public User(String name){
        this.name=name;
    }
    @Override
    public void notify(String message){
        System.out.println(message);
    }
}
