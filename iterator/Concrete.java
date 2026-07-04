import java.util.ArrayList;
import java.util.List;

public class Concrete {
    List<Obj>list;
    Concrete(){
        this.list=new ArrayList<>();
    }
    public void add(Obj object){
        list.add(object);
    }
    public void pop(){
        list.remove(list.size()-1);
    }
    public ObjIterator<Obj> getIterator(){
        return new ObjIterator<>(list);
    }
}
