public class Veg implements Factory{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }
}
