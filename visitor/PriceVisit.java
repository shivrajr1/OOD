public class PriceVisit implements Visitor {
    @Override
    public void bookVisit(Book book) {
        System.out.println("you visited on book price.");
    }
    @Override
    public void fruitVisit(Fruit fruit) {
        System.out.println("you visited on fruit price.");
    }
    @Override
    public void vegetableVisit(Vegetable vegetable) {
        System.out.println("you visited on vegetable price.");
    }
}
