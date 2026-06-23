public class Main {
    public static void main(String[] args) {
        Server1 server1=new Server1(new Sms());
        server1.send();
        Server2 server2=new Server2(new Gmail());
        server2.send();
    }
}
