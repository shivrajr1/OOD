public class Vegetable implements Item {
    @Override
    public void accept(Visitor visitor) {
        visitor.vegetableVisit(this);
    }
}
