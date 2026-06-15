import java.util.ArrayList;

public class Bot implements Cloneable{
    private String name;
    private int capacity;
    private int charge;
    private ArrayList<Integer> list; // this is mutable
    Bot(String name, int capacity, int charge){
        this.name=name;
        this.capacity=capacity;
        this.charge=charge;
        this.list=new ArrayList<>();
        System.out.println("some db request..");
        System.out.println("some other expencive request..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    private Bot(Bot bot){
        this.name=bot.name;
        this.capacity=bot.capacity;
        this.charge=bot.charge;
        this.list=new ArrayList<>(bot.list); // not this.list=bot.list
    }
    @Override
    protected Bot clone(){
        return new Bot(this);
    }

    public ArrayList<Integer> getList() {
        return list;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setCharge(int charge) {
        this.charge = charge;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("[ name : "+name+", capacity : "+capacity+", charge : "+charge+", "+list+" ]");
    }
}
