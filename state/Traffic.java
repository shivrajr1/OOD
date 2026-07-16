public class Traffic {
    Isignal state;
    Traffic(){
        state=new RedSignal();
    }
    public void change(){
        state.next(this);
    }
}
