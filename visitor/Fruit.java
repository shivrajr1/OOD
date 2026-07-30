public class Fruit implements Item{
    @Override
    public void accept(Visitor visitor) {
        visitor.fruitVisit(this);
    }
}
