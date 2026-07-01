public class Main {
    public static void main(String[] args) {
        Light light=new Light();

        ICommand off=new LightOffCommand(light);
        ICommand on=new LightOnCommand(light);

        Executer remote=new Executer(on);
        remote.pressButton();

        remote.setCommand(off);
        remote.pressButton();
    }
}
