public class Plus implements Iinterpret{
    Iinterpret num1;
    Iinterpret num2;
    Plus(Iinterpret num1, Iinterpret num2){
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    public int innterpret() {
        return num1.innterpret()+num2.innterpret();
    }
}
