public class NonVeg implements Factory{
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }
    @Override
    public Pizza createPizza() {
        return new NonVegPizza();
    }
}
