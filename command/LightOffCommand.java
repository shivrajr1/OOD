public class LightOffCommand implements ICommand{
    private Light light;
    LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
