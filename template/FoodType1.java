public class FoodType1 extends Food{
    FoodType1(){
        System.out.println("food 1 prepration start..");
    }
    @Override
    public void customStep1() {
        System.out.println("Food1 with custom 1");
    }
    @Override
    public void customStep2() {
        System.out.println("Food1 with custom 2");
    }
}
