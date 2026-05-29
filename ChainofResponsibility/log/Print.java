public class Print extends Logger{
    Print(Logger logger){
        super(logger);
    }
    public void log(int type, String message){
        if (type==print) {
            System.out.println(message);
            return;
        }
        logger.log(type, message);
    }
}
