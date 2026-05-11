import java.util.ArrayList;

public class UserManager {
    private ArrayList<User>list=new ArrayList<>();
    public void addUser(User user){
        list.add(user);
    }
    public void removeUser(User user){
        list.remove(user);
    }
    public void notifyUsers(String message){
        for(User user:list){
            user.notify(message);
        }
    }
}
