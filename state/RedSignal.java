public class RedSignal implements Isignal{
    @Override
    public void next(Traffic traffic) {
        traffic.state=new GreenSignal();
        System.out.println("light turn to green");
    }
}
