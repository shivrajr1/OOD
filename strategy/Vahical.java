// we use strategy when sibling extend parent, and they override parent method but code of sibling are same and some sibling ok with default parent method then use strategy pattern


class Vahical{
    StrategyType strategy;
    public Vahical(StrategyType strategy){
        this.strategy=strategy;
    }
    public void drive(){
        this.strategy.drive();
    }
}