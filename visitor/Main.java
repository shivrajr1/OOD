public class Main {
    public static void main(String[] args) {
        Item book=new Book();
        Item fruit=new Fruit();
        Item vegetable=new Vegetable();

        Visitor nameVisitor=new NameVisit();
        Visitor priceVisitor=new PriceVisit();
        Visitor typeVisitor=new TypeVisit();

        book.accept(nameVisitor);
        book.accept(priceVisitor);
        book.accept(typeVisitor);

        fruit.accept(nameVisitor);
        fruit.accept(priceVisitor);
        fruit.accept(typeVisitor);

        vegetable.accept(nameVisitor);
        vegetable.accept(priceVisitor);
        vegetable.accept(typeVisitor);
    }
}
