import java.util.ArrayList;
import java.util.List;

public class Composite implements Product{
    private String name;
    List<Product>list=new ArrayList<>();
    Composite(String name){
        this.name=name;
    }
    public void addComponent(Product component){
        list.add(component);
    }
    public void removeComponent(Product component){
        list.remove(component);
    }
    @Override
    public void showPrice() {
        System.out.println(this.name);
        for(Product component:list){
            component.showPrice();
        }
    }
}
