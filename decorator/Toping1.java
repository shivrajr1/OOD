 class Toping1 extends ExtraAddUp{
    
    public Toping1(BaseCoffee coffee){
        super(coffee);
    }
    @Override
    public int cost() {
        return coffee.cost()+10;
    }
}
