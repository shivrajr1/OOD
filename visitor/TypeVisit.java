public class TypeVisit implements Visitor{
    @Override
    public void bookVisit(Book book) {
        System.out.println("you visited on book type.");
    }
    @Override
    public void fruitVisit(Fruit fruit) {
        System.out.println("you visited on fruit type.");
    }
    @Override
    public void vegetableVisit(Vegetable vegetable) {
        System.out.println("you visited on vegetable type.");
    }
}
