import java.util.Stack;

public class History {
    Stack<Memento>history=new Stack<>();

    public void save(Memento memento){
        history.push(memento);
    }
    public Memento redo(){
        return history.pop();
    }
}
