public class NameVisit implements Visitor{
    @Override
    public void bookVisit(Book book) {
        System.out.println("you visited on book name.");
    }
    @Override
    public void fruitVisit(Fruit fruit) {
        System.out.println("you visited on fruit name.");
    }
    @Override
    public void vegetableVisit(Vegetable vegetable) {
        System.out.println("you visited on vegetable name.");
    }
}
