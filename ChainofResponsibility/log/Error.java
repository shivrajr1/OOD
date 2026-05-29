public class Error extends Logger{
    Error(Logger logger){
        super(logger);
    }
    public void log(int type, String message){
        if (type==err) {
            System.out.println(message);
            return;
        }
        logger.log(type, message);
    }
}
