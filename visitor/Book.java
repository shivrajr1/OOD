public class Book implements Item{
    @Override
    public void accept(Visitor visitor) {
        visitor.bookVisit(this);
    }
}
