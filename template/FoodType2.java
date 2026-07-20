public class FoodType2 extends Food{
    FoodType2(){
        System.out.println("food 2 prepration start..");
    }
    @Override
    public void customStep1() {
        System.out.println("Food2 with custom 1");
    }
    @Override
    public void customStep2() {
        System.out.println("Food2 with custom 2");
    }
}
