public class Main {
    public static void main(String[] args) {

        Factory factory1=new Veg();
        Burger burger1=factory1.createBurger();
        burger1.prepare();
        Pizza pizza1=factory1.createPizza();
        pizza1.prepare();


        Factory factory2=new NonVeg();
        Burger burger2=factory2.createBurger();
        burger2.prepare();
        Pizza pizza2=factory2.createPizza();
        pizza2.prepare();
    }
}
