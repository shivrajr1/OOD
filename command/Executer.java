public class Executer  {
    private ICommand command;
    Executer(ICommand command){
        this.command=command;
    }
    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void pressButton(){
        this.command.execute();
    }
}
