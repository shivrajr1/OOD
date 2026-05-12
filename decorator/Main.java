public class Main {
    public static void main(String[] args) {
        BaseCoffee coffee=new Coffee2();
        System.out.println(coffee.cost());

        Toping1 toping1=new Toping1(coffee);
        System.out.println(toping1.cost());

        Toping2 toping2=new Toping2(toping1);
        System.out.println(toping2.cost());

        Toping3 toping3=new Toping3(toping2);
        System.out.println(toping3.cost());
    }
}
