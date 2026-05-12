 class Toping3 extends ExtraAddUp{
    
    public Toping3(BaseCoffee coffee){
        super(coffee);
    }
    @Override
    public int cost() {
        return coffee.cost()+20;
    }
}
