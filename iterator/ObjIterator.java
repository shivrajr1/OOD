import java.util.ArrayList;
import java.util.List;

public class ObjIterator<T> {
    List<T>list=new ArrayList<>();
    int idx;
    ObjIterator(List<T>list){
        this.list=list;
        this.idx=0;
    }
    public T next(){
        if(idx==list.size()){
            System.out.println("there is no next");
            return null;
        }
        return list.get(idx++);
    }
    public boolean hasNext(){
        return idx<list.size();
    }
}
