public class Component implements Product{
    private int price;
    private String name;
    Component(String name, int price){
        this.name=name;
        this.price=price;
    }
    @Override
    public void showPrice() {
        System.out.println(name +" price : "+price);
    }
}
