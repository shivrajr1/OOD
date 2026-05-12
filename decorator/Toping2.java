class Toping2 extends ExtraAddUp{

    public Toping2(BaseCoffee coffee){
        super(coffee);
    }
    @Override
    public int cost() {
        return coffee.cost()+15;
    }
}
