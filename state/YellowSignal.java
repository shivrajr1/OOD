public class YellowSignal implements Isignal{
    @Override
    public void next(Traffic traffic) {
        traffic.state=new RedSignal();
        System.out.println("light turn to red");
    }
}
