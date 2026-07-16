public class GreenSignal implements Isignal{
    @Override
    public void next(Traffic traffic) {
        traffic.state=new YellowSignal();
        System.out.println("light turn to yellow");
    }
}
