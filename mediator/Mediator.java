import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMessanger{
    List<User>users=new ArrayList<>();
    
    @Override
    public void send(User from, User to, String message) {
        to.receive(from,message);
    }
    @Override
    public void sendToAll(User from, String message) {
        for(User to:users){
            to.receive(from, message);
        }
    }
}
